package com.example.tablayoutdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabPagerAdapter constructor(fm: FragmentManager?, var numberOfTabs: Int) : FragmentPagerAdapter(fm!!) {

    var tabCount = numberOfTabs

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> Tab1Fragment()
            1 -> Tab2Fragment()
            2 -> Tab3Fragment()
            3 -> Tab4Fragment()
            else -> Tab1Fragment()
        }

    }

    override fun getCount(): Int {
        return tabCount
    }

}