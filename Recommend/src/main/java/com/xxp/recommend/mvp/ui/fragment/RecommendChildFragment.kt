package com.xxp.recommend.mvp.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent
import com.jess.arms.mvp.IPresenter
import com.xxp.recommend.R
import com.xxp.recommend.mvp.presenter.RecommendChildPresenter
import me.jessyan.armscomponent.commonsdk.core.NullObjectPresenterByFragment

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description : 推荐页面的子页面  二级页面
 */
class RecommendChildFragment : BaseFragment<RecommendChildPresenter>() {

    override fun setupFragmentComponent(appComponent: AppComponent) {
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun setData(data: Any?) {
    }

    override fun initView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return layoutInflater.inflate(R.layout.recommend_fragment_child, container, false)
    }

    companion object {
        fun newInstance(pageType: PageType):Fragment {
            val bundle = Bundle()
            bundle.putString("type",pageType.name)
            val fragment = RecommendChildFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    enum class PageType {
        MOVIE,//电影
        TV,//电视剧
        VARIETY,//综艺
        CARTOON//动漫
    }
}