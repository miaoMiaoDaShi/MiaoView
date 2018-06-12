package com.xxp.recommend.di.module

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.jess.arms.di.scope.FragmentScope
import com.xxp.recommend.mvp.ui.fragment.RecommendChildFragment
import dagger.Module
import dagger.Provides
import me.jessyan.armscomponent.commonsdk.adapter.FragmentPageAdapter
import me.jessyan.armscomponent.commonsdk.core.NullObjectPresenterByFragment

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :推荐页面-入口fragment
 */
@Module
class RecommendModule(val fragmentManager: FragmentManager) {

    @Provides
    @FragmentScope
    fun provideTitles() = listOf("电影", "电视剧", "综艺", "动漫", "儿歌")

    @Provides
    @FragmentScope
    fun provideAdapter(titles: List<String>): FragmentPageAdapter {
        return FragmentPageAdapter(fragmentManager, titles, listOf(
                RecommendChildFragment.newInstance(RecommendChildFragment.PageType.MOVIE),
                RecommendChildFragment.newInstance(RecommendChildFragment.PageType.TV),
                RecommendChildFragment.newInstance(RecommendChildFragment.PageType.VARIETY),
                RecommendChildFragment.newInstance(RecommendChildFragment.PageType.CARTOON)
        ))
    }
}