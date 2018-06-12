package com.xxp.recommend.mvp.model

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import com.xxp.recommend.mvp.contract.RecommendChildContract
import javax.inject.Inject

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :推荐页面
 */
@FragmentScope
class RecommendChildModel
@Inject
constructor(iRepositoryManager: IRepositoryManager) :
        BaseModel(iRepositoryManager),RecommendChildContract.Model {

}