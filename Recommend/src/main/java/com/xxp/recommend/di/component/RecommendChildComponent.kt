package com.xxp.recommend.di.component

import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.FragmentScope
import com.xxp.recommend.di.module.RecommendChildModule
import com.xxp.recommend.di.module.RecommendModule
import com.xxp.recommend.mvp.ui.fragment.RecommendChildFragment
import com.xxp.recommend.mvp.ui.fragment.RecommendFragment
import dagger.Component

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description : 推荐页面 二级页面
 */
@FragmentScope
@Component(modules = arrayOf(RecommendChildModule::class) ,dependencies = arrayOf(AppComponent::class))
interface RecommendChildComponent {
    fun inject(fragment: RecommendChildFragment)
}