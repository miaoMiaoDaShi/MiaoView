package com.xxp.recommend.mvp.model.api

/**
 * ================================================
 * 存放一些与 API 有关的东西,如请求地址,请求码等
 *
 *
 * Created by ArmsComponentTemplate
 * [Contact me](mailto:jess.yan.effort@gmail.com)
 * [Follow me](https://github.com/JessYanCoding)
 * ================================================
 */
interface Api {
    companion object {
        //闪图
        val banner_url = "http://mob.bz.mgtv.com/odin/c1/video/list?moduleId=1113&type=10&pageNum=1&pageSize=4"
        //电影页数据数据
        val MOVIE_URL = "http://pianku.api.mgtv.com/rider/tag-data?tagId=245"
        //获取更多电影
        //http://mobile.api.hunantv.com/list?pageCount=1&pageSize=30&typeId=3&types=53
        val MOVIE_child_category_url = "http://mobile.api.hunantv.com/list?pageCount=1&pageSize=30&typeId=3&types="
    }
}
