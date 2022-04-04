package com.example.neonkeyboardnew.fragments

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.neonkeyboardnew.MainActivity
import com.example.neonkeyboardnew.R
import com.example.neonkeyboardnew.TestKeyboardActivity
import com.example.neonkeyboardnew.adapter.FavAdapter
import com.example.neonkeyboardnew.ads.AdLoader
import com.example.neonkeyboardnew.apputils.ConstValues
import com.example.neonkeyboardnew.databinding.DeleteFavBottomsheetBinding
import com.example.neonkeyboardnew.databinding.FragmentFavouriteBinding
import com.example.neonkeyboardnew.keyboardutils.editPrefs
import com.example.neonkeyboardnew.keyboardutils.getMyPreferences
import com.example.neonkeyboardnew.keyboardutils.isVisible
import com.example.neonkeyboardnew.models.ThemesModel
import com.google.android.gms.ads.nativead.NativeAdView
import com.google.android.material.bottomsheet.BottomSheetDialog
import keyboard.neon.newboard.util.checkIfImeIsEnabled
import keyboard.neon.newboard.util.checkIfImeIsSelected
import keyboard.neon.newboard.util.showToast
import timber.log.Timber


class FavouriteFragment : BaseFragment() {

    private var favThemeAdCount = 0

    private lateinit var myActivity: MainActivity
    private lateinit var favouriteBinding: FragmentFavouriteBinding
    private var itemToHide: MenuItem? = null
    private var adLoadingBox: AdLoader? = null
    private val favAdapter = FavAdapter { themes, _ ->
        favAdapterClick(themes)
    }

    private fun favAdapterClick(theme: ThemesModel) {

        if (checkIfImeIsEnabled(myActivity)) {
            if (checkIfImeIsSelected(myActivity)) {
//                themesViewModel.toggleFavThemeStatus(theme.themeId, true)


                val setTheme = "assets:ime/theme/${theme.themeJsonName}.json"
                keyboardPrefs.theme.dayThemeRef = setTheme


                val selectionID =
                    myActivity.getMyPreferences().getInt(ConstValues.prefKeyFavThemeItem, -10)

                Timber.d("before observer pref value : $selectionID")

                favAdapter.handleSelection(selectionID, theme.themeId)


                val neonId = myActivity.getMyPreferences().getInt(ConstValues.prefKeyNeonItem, 0)
                val simpleThemeId =
                    myActivity.getMyPreferences().getInt(ConstValues.prefKeyThemeItem, 0)


                themesViewModel.unSelectNeonTheme?.invoke(neonId)
                themesViewModel.unSelectTheme?.invoke(simpleThemeId)

                myActivity.getMyPreferences().editPrefs {
                    putInt(ConstValues.prefKeyFavThemeItem, theme.themeId)
                    putInt(ConstValues.prefKeyThemeItem, theme.themeId)
                    putInt(ConstValues.prefKeyNeonItem, theme.themeId)
                }


                themesViewModel.changeFavTheme?.invoke(theme.themeId)


                if (favThemeAdCount == ConstValues.fullScreenAdShowCount) {
                    favThemeAdCount = 0
                    showFullScreenAdThemeClick(theme)
                } else {
                    favThemeAdCount++
                    startActivity(
                        Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                            "themeModel",
                            theme
                        )
                    )

                }


            } else {
                showEnableKbBottomSheet(
                    myActivity, "Select the  Keyboard as default  and \n" +
                            " Apply Themes."
                )
            }
        } else {
            showEnableKbBottomSheet(
                myActivity, "Enable the  Keyboard  and \n" +
                        " Apply Themes. "
            )
        }


    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        myActivity = context as MainActivity
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        menu.clear()
        myActivity.menuInflater.inflate(R.menu.fav_menu, menu)

        itemToHide = menu.findItem(R.id.deleteAllFavButton)
            .setVisible(!themesViewModel.keyboardFavThemesList.value.isNullOrEmpty())

        Timber.d("menu create")
        super.onCreateOptionsMenu(menu, inflater)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.deleteAllFavButton -> {

                if (favAdapter.currentList.count() > 0) {
                    showDeleteAllFavBottomSheet()
                } else {
                    myActivity.showToast("No Favourite Theme.")
                }

            }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        favouriteBinding = FragmentFavouriteBinding.inflate(inflater, container, false)
        adLoadingBox = AdLoader(myActivity)
        return favouriteBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val selectedFavItem =
//            myActivity.getMyPreferences().getInt(ConstValues.prefKeyFavThemeItem, 0)


        favouriteBinding.favThemesRv.apply {
            layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
//            layoutManager = WrapStaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
            adapter = favAdapter
            setHasFixedSize(true)
        }


        themesViewModel.keyboardFavThemesList.observe(viewLifecycleOwner) {
            handleObserver(it as MutableList<ThemesModel>)
        }


        themesViewModel.handleFavSelection = { oldThemeId, newThemeId ->
            favAdapter.handleSelection(oldThemeId, newThemeId)

        }

    }

    private fun handleObserver(list: MutableList<ThemesModel>) {


        if (list.isNotEmpty()) {

            handleSmallAd(list.size < 4)

            val selectedFavItem =
                myActivity.getMyPreferences().getInt(ConstValues.prefKeyFavThemeItem, -10)

            Timber.d("pref value : $selectedFavItem")
            myActivity.listNativeAd?.let { it ->

                favAdapter.sendNativeAd(it)

                list.forEach { themeItem ->
                    themeItem.themeIsSelected = themeItem.themeId == selectedFavItem
                }

                var adID1 = -20
                var adIndex = 4
                if (list.size >= adIndex) {
                    var numberOfAds = 3
                    while (list.size >= adIndex && numberOfAds > 0) {
                        val adModel =
                            ThemesModel(
                                adID1,
                                adID1.toLong(),
                                adID1,
                                "",
                                "",
                                "",
                                isNeon = false,
                                themeIsSelected = false,
                                true
                            )
                        if (!list.contains(adModel)) {
                            list.add(adIndex, adModel)
                        }
                        adID1--
                        --numberOfAds
                        adIndex += 4 + 1
                    }

                }


                favAdapter.submitList(list)


                list.forEach {

                    Timber.d("id : ${it.id} thid: ${it.themeId}")
                }


                toggle(list.isNotEmpty())

            } ?: run {

                list.forEach { themeItem ->
                    themeItem.themeIsSelected = themeItem.themeId == selectedFavItem
                }
                favAdapter.submitList(list)
                toggle(list.isNotEmpty())
            }
        } else {
            favAdapter.submitList(list)
            toggle(list.isNotEmpty())
            handleSmallAd(true)


        }


//
//        if (newList.isNotEmpty()) {
//            favAdapter.submitList(newList)
////            favAdapter.handleSelection(-10, selectedFavItem)
////            favAdapter.setList(newList)
////            loadAndInsertAd(newList)
//
//        }

    }


    private fun handleSmallAd(adState: Boolean) {

        when (adState) {
            true -> {

                myActivity.listNativeAd?.let { nativeAd ->


                    favouriteBinding.apply {
                        nativeAdLiveContainer.isVisible(true)
                        val adView = layoutInflater.inflate(
                            R.layout.small_nativead_layout,
                            favouriteBinding.favFragmentRoot,
                            false
                        ) as NativeAdView


                        populateNativeAdView(nativeAd, adView)
                        nativeAdLiveContainer.removeAllViews()
                        nativeAdLiveContainer.addView(adView)
                    }


                } ?: run {

                    clearAdView()
                }
            }
            else -> {
                clearAdView()
            }
        }


    }

    private fun clearAdView() {
        favouriteBinding.nativeAdLiveContainer.removeAllViews()
        favouriteBinding.nativeAdLiveContainer.isVisible(false)

    }

    private fun showDeleteAllFavBottomSheet() {


        val deleteFavBottomSheetBinding: DeleteFavBottomsheetBinding by lazy {
            DeleteFavBottomsheetBinding.inflate(layoutInflater)
        }
        val dialog = BottomSheetDialog(myActivity, R.style.CustomBottomSheetDialogTheme)

        with(dialog)
        {
            setContentView(deleteFavBottomSheetBinding.root)
            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }



        with(deleteFavBottomSheetBinding)
        {


            cancelFavDialog.setOnClickListener {

                dialog.dismiss()
            }
            removeAllThemes.setOnClickListener {

                themesViewModel.themesRepo.removeAllFavThemes {

                    Timber.d("pref value : $it")
                    myActivity.getMyPreferences()
                        .editPrefs { putInt(ConstValues.prefKeyFavThemeItem, -10) }

                }
                dialog.dismiss()

            }


        }

        dialog.show()

    }


    private fun toggle(state: Boolean) {
        favouriteBinding.favThemePlaceHolder.isVisible(!state)
        favouriteBinding.favThemesRv.isVisible(state)
        itemToHide?.isVisible = state
    }


    private fun showFullScreenAdThemeClick(theme: ThemesModel) {
        if (isInternetConnected()) {

            fullScreenAd.loadInterstitialThemeAd(loaded = {


                when (it) {
                    true -> {

                        adLoadingBox?.closeDialog()
                        fullScreenAd.showThemesInterstitial(myActivity) {

                            startActivity(
                                Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                                    "themeModel",
                                    theme
                                )
                            )


                        }

                    }
                    else -> {
                        adLoadingBox?.closeDialog()
                        startActivity(
                            Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                                "themeModel",
                                theme
                            )
                        )


                    }
                }


            }, showLoader = {
                adLoadingBox?.showDialog()

            })

        } else {
            startActivity(
                Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                    "themeModel",
                    theme
                )
            )
        }

    }


    private fun loadAndInsertAd(list: List<ThemesModel>) {
        val newList = mutableListOf<ThemesModel>()
        newList.addAll(list)
        Timber.d(favAdapter.currentList.size.toString())
        myActivity.loadAndShowAdList({
            it?.let {
//                favAdapter.sendNativeAd(it)
//                favAdapter.insertAdInFavItem()
                var adID = 900
                var adIndex = 4
                if (newList.isNotEmpty() && newList.size >= adIndex) {
                    var numberOfAds = 2
                    while (newList.size >= adIndex && numberOfAds > 0) {
                        val adModel =
                            ThemesModel(
                                ++adID,
                                System.currentTimeMillis(),
                                adID,
                                "AD${adID}",
                                "AD${adID}",
                                "AD${adID}",
                                isNeon = false,
                                themeIsSelected = false,
                                true
                            )
                        if (!newList.contains(adModel)) {
                            newList.add(adIndex, adModel)
                        }
                        --numberOfAds
                        adIndex += 4 + 1
                    }
                    favAdapter.submitList(newList)
                    Timber.d(favAdapter.currentList.size.toString())
                }
            }
        }, myActivity.getString(R.string.listNativeAdId))
    }

}