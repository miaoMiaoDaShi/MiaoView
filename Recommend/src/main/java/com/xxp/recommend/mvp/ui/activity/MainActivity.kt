package com.xxp.recommend.mvp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter

import com.jess.arms.base.BaseActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.utils.ArmsUtils

import com.xxp.recommend.mvp.contract.MainContract
import com.xxp.recommend.mvp.presenter.MainPresenter

import com.xxp.recommend.R
import me.jessyan.armscomponent.commonsdk.core.RouterHub
import me.jessyan.armscomponent.commonsdk.core.navigationx


@Suppress("CAST_NEVER_SUCCEEDS")
class MainActivity : BaseActivity<MainPresenter>(), MainContract.View {

    override fun setupActivityComponent(ppComponent: AppComponent) {

    }


    override fun initView(savedInstanceState: Bundle?): Int {
        return R.layout.recommend_activity_main //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }


    override fun initData(savedInstanceState: Bundle?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val recommendFragment = ARouter.getInstance().navigationx(RouterHub.RECOMMEND_RECOMMEND_FRAGMENT) as Fragment
        fragmentTransaction.replace(R.id.mFlContent, recommendFragment).commit()
    }


    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showMessage(message: String) {
        ArmsUtils.snackbarText(message)
    }

    override fun launchActivity(intent: Intent) {
        ArmsUtils.startActivity(intent)
    }

    override fun killMyself() {
        finish()
    }
}
