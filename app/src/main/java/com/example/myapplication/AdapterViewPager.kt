package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterViewPager( fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return "tst"
    }

    override fun getItem(position: Int): Fragment {
        return MovieFragment(position)
    }

    override fun getCount(): Int {
        return 2
    }
}