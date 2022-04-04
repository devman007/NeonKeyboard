package com.example.neonkeyboardnew.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.neonkeyboardnew.MainActivity
import com.example.neonkeyboardnew.databinding.ThemeOptionsBinding
import com.google.android.material.tabs.TabLayoutMediator



class ThemeOptionsFragment : BaseFragment() {

    private lateinit var tabListThemesType: ArrayList<ThemeOptionsModel>
    private lateinit var themeOptionsBinding: ThemeOptionsBinding
    private lateinit var myActivity: MainActivity


    override fun onAttach(context: Context) {
        super.onAttach(context)
        myActivity = context as MainActivity

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        themeOptionsBinding = ThemeOptionsBinding.inflate(inflater, container, false)
        tabListThemesType = arrayListOf()
        tabListThemesType.add(ThemeOptionsModel("Trending"))
        tabListThemesType.add(ThemeOptionsModel("Neon"))
        tabListThemesType.add(ThemeOptionsModel("Favourites"))
        return themeOptionsBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        with(themeOptionsBinding)
        {
            tabListThemesType.forEach {
                val tab = tabLayoutThemesOption.newTab()
                tab.text = it.name
                tabLayoutThemesOption.addTab(tab)

            }

            val adapter = ViewPagerAdapter(tabLayoutThemesOption.tabCount)
            viewPagerThemesOption.adapter = adapter
            viewPagerThemesOption.offscreenPageLimit = 3
//            viewPagerThemesOption.isUserInputEnabled = false
            TabLayoutMediator(tabLayoutThemesOption, viewPagerThemesOption) { tab, position ->
                tab.text = tabListThemesType[position].name
            }.attach()
        }

    }

    data class ThemeOptionsModel(val name: String)

    inner class ViewPagerAdapter(private val totalTabs: Int) : FragmentStateAdapter(this) {
        override fun createFragment(position: Int): Fragment {


            return when (position) {
                0 -> ThemesFragment()
                1 -> NeonThemesFragment()
                else -> FavouriteFragment()
            }

//            return fragmentsCustomizeList[position]
        }

        override fun getItemCount(): Int {
            return totalTabs
        }

    }


}