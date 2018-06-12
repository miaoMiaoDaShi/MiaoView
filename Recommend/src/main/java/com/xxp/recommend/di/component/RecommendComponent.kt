package com.xxp.recommend.di.component

import com.jess.arms.di.component.AppComponent
import com.jess.arms.di.scope.FragmentScope
import com.xxp.recommend.di.module.RecommendModule
import com.xxp.recommend.mvp.ui.fragment.RecommendFragment
import dagger.Component

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :
 */
@FragmentScope
@Component(modules = arrayOf(RecommendModule::class) ,dependencies = arrayOf(AppComponent::class))
interface RecommendComponent {
    fun inject(fragment: RecommendFragment)
}