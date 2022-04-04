package com.example.neonkeyboardnew.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.example.neonkeyboardnew.MainActivity
import com.example.neonkeyboardnew.R
import com.example.neonkeyboardnew.databinding.AllthemesItemLayoutBinding
import com.example.neonkeyboardnew.databinding.ListNativeadLayoutBinding
import com.example.neonkeyboardnew.keyboardutils.isVisible
import com.example.neonkeyboardnew.models.ThemesModel
import com.google.android.gms.ads.VideoController
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdView

class AllThemesAdapter(
    private val onThemeClicked: (ThemesModel) -> Unit
) : ListAdapter<ThemesModel, RecyclerView.ViewHolder>(ItemDiffCallback()) {

    private var listNativeAd: NativeAd? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


        return when (viewType) {
            0 -> {
                ItemViewHolder(
                    AllthemesItemLayoutBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    ), onThemeClicked
                )
            }
            else -> {

                AdViewHolder(
                    ListNativeadLayoutBinding.inflate(
                        LayoutInflater.from(parent.context), parent,
                        false
                    )
                )
            }
        }

    }

    override fun getItemViewType(position: Int): Int {

        return if (currentList[position].isNativeAd) 1
        else
            0
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        when (holder) {
            is ItemViewHolder -> {
                holder.bind(getItem(position))
                val layoutParams =
                    holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams
                layoutParams.isFullSpan = false
            }
            is AdViewHolder -> {
                holder.bind()
                val layoutParams =
                    holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams
                layoutParams.isFullSpan = true
            }
        }

    }


    inner class ItemViewHolder(
        private val themeItemBinding: AllthemesItemLayoutBinding,
        private val onThemeClicked: (ThemesModel) -> Unit
    ) : RecyclerView.ViewHolder(themeItemBinding.root) {

        private var currentTheme: ThemesModel? = null


        init {


            themeItemBinding.root.setOnClickListener {

                currentTheme?.let {

                    onThemeClicked.invoke(it)

                }

            }

        }

        fun bind(item: ThemesModel) {
            this.currentTheme = item
            currentTheme?.let {

                if (!it.isNeon!!) {
                    if (it.themeId == 1)
                        themeItemBinding.themeIvLayer2.isVisible(false)
                    else
                        themeItemBinding.themeIvLayer2.isVisible(true)
                    setUpImages(it.themeDrawableName!!)
                    setUpNeonKeysImages(it.keysBgName!!)

                } else {
                    themeItemBinding.themeIvLayer2.isVisible(true)
                    setUpImages(it.themeDrawableName!!)
                    setUpNeonKeysImages(it.keysBgName!!)
                }



                bindThemeState(it.themeIsSelected)

            }

        }


        private fun setUpImages(drawableName: String) {
//            var requestOptions = RequestOptions()
//            requestOptions = requestOptions.transforms(FitCenter(), RoundedCorners(12))

            val drawableId = themeItemBinding.root.context.resources.getIdentifier(
                drawableName,
                "drawable",
                themeItemBinding.root.context.packageName
            )

            Glide.with(themeItemBinding.root)
                .load(drawableId)
                .into(themeItemBinding.themeIv)


//                .diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE)
//                .skipMemoryCache(true)
        }


        private fun setUpNeonKeysImages(drawableNameKeys: String) {
            val drawableId = themeItemBinding.root.context.resources.getIdentifier(
                drawableNameKeys,
                "drawable",
                themeItemBinding.root.context.packageName
            )

            Glide.with(themeItemBinding.root)
                .load(drawableId)
                .into(themeItemBinding.themeIvLayer2)
        }

        private fun bindThemeState(isThemeSelected: Boolean) {
            themeItemBinding.themeSelectedIv.isVisible(isThemeSelected)
            if (isThemeSelected) {
                themeItemBinding.themeIv.alpha = 0.5F
            } else {
                themeItemBinding.themeIv.alpha = 1.0F
            }
        }
    }

    inner class AdViewHolder(private val mBinding: ListNativeadLayoutBinding) :
        RecyclerView.ViewHolder(mBinding.root) {

        fun bind() {
            mBinding.apply {

                val adView = (root.context as MainActivity).layoutInflater.inflate(
                    R.layout.list_large_adlayout,
                    listAdlayoutContainer,
                    false
                ) as NativeAdView

                listNativeAd?.let {
                    populateNativeAdView(it, adView)
                    this.adFrameLayout.removeAllViews()
                    this.adFrameLayout.addView(adView)
                } ?: run {
                    this.adFrameLayout.removeAllViews()
                }
            }
        }
    }

    override fun getItemId(position: Int): Long {
        return currentList[position].themeId.toLong()
    }


    fun sendNativeAd(nativeAd: NativeAd?) {

        this.listNativeAd = nativeAd
    }


}


private fun populateNativeAdView(nativeAd: NativeAd, adView: NativeAdView) {
    // Set the media view.
    adView.mediaView = adView.findViewById(R.id.ad_media)

    // Set other ad assets.
    adView.headlineView = adView.findViewById(R.id.ad_headline)
    adView.bodyView = adView.findViewById(R.id.ad_body)
    adView.callToActionView = adView.findViewById(R.id.ad_call_to_action)
    adView.iconView = adView.findViewById(R.id.ad_app_icon)
    adView.advertiserView = adView.findViewById(R.id.ad_advertiser)
    (adView.headlineView as TextView).text = nativeAd.headline
    adView.mediaView?.setMediaContent(nativeAd.mediaContent!!)
    adView.mediaView?.setImageScaleType(ImageView.ScaleType.CENTER_CROP)
    if (nativeAd.body == null) {
        adView.bodyView?.visibility = View.INVISIBLE
    } else {
        adView.bodyView?.visibility = View.VISIBLE
        (adView.bodyView as TextView).text = nativeAd.body
    }

    if (nativeAd.callToAction == null) {
        adView.callToActionView?.visibility = View.INVISIBLE
    } else {
        adView.callToActionView?.visibility = View.VISIBLE
        (adView.callToActionView as Button).text = nativeAd.callToAction
    }

    if (nativeAd.icon == null) {
        adView.iconView?.visibility = View.GONE
    } else {
        (adView.iconView as ImageView).setImageDrawable(
            nativeAd.icon?.drawable
        )
        adView.iconView?.visibility = View.VISIBLE
    }

    adView.setNativeAd(nativeAd)

    val vc = nativeAd.mediaContent?.videoController!!

    if (vc.hasVideoContent()) {

        vc.videoLifecycleCallbacks = object : VideoController.VideoLifecycleCallbacks() {
        }
    }

}

class ItemDiffCallback : DiffUtil.ItemCallback<ThemesModel>() {
    override fun areItemsTheSame(oldItem: ThemesModel, newItem: ThemesModel): Boolean {
        return oldItem.themeId == newItem.themeId
    }

    override fun areContentsTheSame(oldItem: ThemesModel, newItem: ThemesModel): Boolean {
        return oldItem == newItem
    }

    override fun getChangePayload(oldItem: ThemesModel, newItem: ThemesModel): Any {
        return oldItem.themeIsSelected != newItem.themeIsSelected
    }
}



