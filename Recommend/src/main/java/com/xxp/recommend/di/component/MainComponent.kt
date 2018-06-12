package com.xxp.recommend.di.component

import dagger.Component
import com.jess.arms.di.component.AppComponent

import com.xxp.recommend.di.module.MainModule

import com.jess.arms.di.scope.ActivityScope
import com.xxp.recommend.mvp.ui.activity.MainActivity
import com.xxp.recommend.mvp.ui.fragment.MainFragment

@ActivityScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(AppComponent::class))
interface MainComponent {
    fun inject(activity: MainActivity)
    fun inject(fragment: MainFragment)
}
