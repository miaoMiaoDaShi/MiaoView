package com.xxp.miaoview.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.xxp.miaoview.di.module.MainModule;

import com.jess.arms.di.scope.ActivityScope;
import com.xxp.miaoview.mvp.ui.activity.MainActivity;

@ActivityScope
@Component(modules = MainModule.class, dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);
}