package com.xxp.mine.di.component;

import dagger.Component;
import com.jess.arms.di.component.AppComponent;

import com.xxp.mine.di.module.MainModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xxp.mine.mvp.ui.activity.MainActivity;

@ActivityScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(AppComponent::class))
interface MainComponent {
    fun inject(activity: MainActivity)
}
