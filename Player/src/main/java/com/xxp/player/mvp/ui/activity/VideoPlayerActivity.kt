package com.xxp.player.mvp.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import cn.jzvd.JZVideoPlayer
import cn.jzvd.JZVideoPlayerStandard
import com.jess.arms.base.BaseActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.mvp.IPresenter
import com.xxp.player.R
import kotlinx.android.synthetic.main.activity_video_player.*

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/6
 * Description : 视屏的播放页面
 */
class VideoPlayerActivity : BaseActivity<IPresenter>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
    }
    override fun initData(savedInstanceState: Bundle?) {
        //标题
        val title = intent.getStringExtra("title")
        //连接
        val url = intent.getStringExtra("url")

        mJZVideoPlayerStandard.setUp(url, JZVideoPlayerStandard.SCREEN_WINDOW_FULLSCREEN, title)
        mJZVideoPlayerStandard.startButton.performClick()
        mJZVideoPlayerStandard.fullscreenButton.visibility = View.INVISIBLE
        mJZVideoPlayerStandard.backButton.setOnClickListener { finish() }
    }

    @SuppressLint("MissingSuperCall")
    override fun onPause() {
        super.onPause()
        JZVideoPlayer.releaseAllVideos()
    }

//    override fun onBackPressed() {
//        if (JZVideoPlayer.backPress()) {
//            return
//        }
//        super.onBackPressed()
//    }

    override fun setupActivityComponent(appComponent: AppComponent) {
    }

    override fun initView(savedInstanceState: Bundle?): Int = R.layout.activity_video_player
}