package com.xxp.miaoview.mvp.model

import android.app.Application

import com.google.gson.Gson
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel

import com.jess.arms.di.scope.ActivityScope

import javax.inject.Inject

import com.xxp.miaoview.mvp.contract.MainContract


@ActivityScope
class MainModel @Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), MainContract.Model {
    @Inject
    internal var mGson: Gson? = null
    @Inject
    internal var mApplication: Application? = null

    override fun onDestroy() {
        super.onDestroy()
        this.mGson = null
        this.mApplication = null
    }
}