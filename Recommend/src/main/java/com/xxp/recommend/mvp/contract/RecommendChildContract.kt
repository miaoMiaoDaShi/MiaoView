package com.xxp.recommend.mvp.contract

import com.jess.arms.mvp.IModel
import com.jess.arms.mvp.IView
import com.xxp.recommend.mvp.model.entity.BannerBean
import com.xxp.recommend.mvp.model.entity.RecommendListBean
import io.reactivex.Observable

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :推荐页面-子页面
 */
interface RecommendChildContract {
    interface View : IView

    interface Model : IModel {
        /**
         * 轮播图的数据
         */
        fun getBanner(): Observable<BannerBean>

        /**
         * 列表推荐数据
         */
        fun getRecommendList(): Observable<RecommendListBean>
    }
}