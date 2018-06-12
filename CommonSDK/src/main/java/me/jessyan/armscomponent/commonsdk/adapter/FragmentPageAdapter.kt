package me.jessyan.armscomponent.commonsdk.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/22
 * Description :
 */
class FragmentPageAdapter
constructor(val mFragmentManager: FragmentManager,val mTitles:List<String> ,val mFragments:List<Fragment> )
    : FragmentStatePagerAdapter(mFragmentManager) {


    override fun getItem(position: Int): Fragment = mFragments[position]

    override fun getCount(): Int = mFragments.size

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitles[position]
    }
}