package com.xxp.recommend.mvp.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alibaba.android.arouter.facade.annotation.Route
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent
import com.xxp.recommend.R
import com.xxp.recommend.di.component.DaggerRecommendComponent
import com.xxp.recommend.di.module.RecommendModule
import com.xxp.recommend.mvp.contract.RecommendChildContract
import kotlinx.android.synthetic.main.recommend_fragment_recommend.*
import me.jessyan.armscomponent.commonsdk.adapter.FragmentPageAdapter
import me.jessyan.armscomponent.commonsdk.core.NullObjectPresenterByFragment
import me.jessyan.armscomponent.commonsdk.core.RouterHub
import javax.inject.Inject

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :推荐页面 入口
 */
@Route(path = RouterHub.RECOMMEND_RECOMMEND_FRAGMENT)
class RecommendFragment : BaseFragment<NullObjectPresenterByFragment>(), RecommendChildContract.View {
    @Inject
    lateinit var mAdapter: FragmentPageAdapter

    override fun setupFragmentComponent(appComponent: AppComponent) {
        DaggerRecommendComponent.builder()
                .appComponent(appComponent)
                .recommendModule(RecommendModule(childFragmentManager))
                .build()
                .inject(this)
    }

    override fun initData(savedInstanceState: Bundle?) {
        initTabs()
    }

    private fun initTabs() {
        mVpRecommend.adapter = mAdapter
        mTabs.setupWithViewPager(mVpRecommend)

    }

    override fun setData(data: Any?) {
    }

    override fun initView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.recommend_fragment_recommend, container, false)
    }

    override fun showLoading() {
    }

    override fun launchActivity(intent: Intent) {
    }

    override fun hideLoading() {
    }

    override fun killMyself() {
    }

    override fun showMessage(message: String) {
    }
}