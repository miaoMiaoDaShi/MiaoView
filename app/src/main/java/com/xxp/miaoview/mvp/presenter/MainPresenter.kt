package com.xxp.miaoview.mvp.presenter

import android.app.Application

import com.jess.arms.integration.AppManager
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.mvp.BasePresenter
import com.jess.arms.http.imageloader.ImageLoader

import me.jessyan.rxerrorhandler.core.RxErrorHandler

import javax.inject.Inject

import com.xxp.miaoview.mvp.contract.MainContract


@ActivityScope
class MainPresenter @Inject
constructor(model: MainContract.Model, rootView: MainContract.View) : BasePresenter<MainContract.Model, MainContract.View>(model, rootView) {
    @Inject
    internal var mErrorHandler: RxErrorHandler? = null
    @Inject
    internal var mApplication: Application? = null
    @Inject
    internal var mImageLoader: ImageLoader? = null
    @Inject
    internal var mAppManager: AppManager? = null

    override fun onDestroy() {
        super.onDestroy()
        this.mErrorHandler = null
        this.mAppManager = null
        this.mImageLoader = null
        this.mApplication = null
    }
}
