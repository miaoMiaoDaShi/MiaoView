package com.xxp.mine.mvp.model;

import android.app.Application;
import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;
import javax.inject.Inject;

import com.xxp.mine.mvp.contract.MainContract;


@ActivityScope
class MainModel
@Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), MainContract.Model {
    @Inject
    lateinit var mGson: Gson;
    @Inject
    lateinit var mApplication: Application;


    override fun onDestroy() {
        super.onDestroy()
    }
}
