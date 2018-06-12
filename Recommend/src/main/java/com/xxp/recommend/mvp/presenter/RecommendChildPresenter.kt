package com.xxp.recommend.mvp.presenter

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.BasePresenter
import com.xxp.recommend.mvp.contract.RecommendChildContract
import javax.inject.Inject

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description : 推荐页面
 */
@FragmentScope
class RecommendChildPresenter
@Inject
constructor(model: RecommendChildContract.Model, view: RecommendChildContract.View) :
        BasePresenter<RecommendChildContract.Model, RecommendChildContract.View>(model, view) {
}