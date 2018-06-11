package com.xxp.miaoview.mvp.ui.activity

import android.content.Intent
import android.os.Bundle
import com.ashokvarma.bottomnavigation.BottomNavigationItem

import com.jess.arms.base.BaseActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.utils.ArmsUtils

import com.xxp.miaoview.di.module.MainModule
import com.xxp.miaoview.mvp.contract.MainContract
import com.xxp.miaoview.mvp.presenter.MainPresenter

import com.xxp.miaoview.R


import com.jess.arms.utils.Preconditions.checkNotNull
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity<MainPresenter>(), MainContract.View {

    override fun setupActivityComponent(appComponent: AppComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mainModule(MainModule(this))
                .build()
                .inject(this)
    }

    override fun initView(savedInstanceState: Bundle?): Int {
        return R.layout.activity_main //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    override fun initData(savedInstanceState: Bundle?) {
        initBottomNavBar()
    }

    private fun initBottomNavBar() {
        mBottomNavBar
                .addItem(BottomNavigationItem(R.drawable.ic_nav_home, "首页")
                        .setActiveColor(R.color.public_color_CDD3D7)
                        .setInActiveColor(R.color.public_colorPrimary))
                .addItem(BottomNavigationItem(R.drawable.ic_nav_video, "影视")
                        .setActiveColor(R.color.public_color_CDD3D7)
                        .setInActiveColor(R.color.public_colorPrimary))
                .addItem(BottomNavigationItem(R.drawable.ic_nav_image, "图库")
                        .setActiveColor(R.color.public_color_CDD3D7)
                        .setInActiveColor(R.color.public_colorPrimary))
                .addItem(BottomNavigationItem(R.drawable.ic_nav_mine, "我的")
                        .setActiveColor(R.color.public_color_CDD3D7)
                        .setInActiveColor(R.color.public_colorPrimary))

    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showMessage(message: String) {
        checkNotNull(message)
        ArmsUtils.snackbarText(message)
    }

    override fun launchActivity(intent: Intent) {
        checkNotNull(intent)
        ArmsUtils.startActivity(intent)
    }

    override fun killMyself() {
        finish()
    }
}
