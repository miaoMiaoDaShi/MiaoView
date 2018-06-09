package com.xxp.player

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xxp.player.mvp.ui.activity.VideoPlayerActivity
import kotlinx.android.synthetic.main.activity_test.*
import org.jetbrains.anko.startActivity

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/6
 * Description : play测试使用的activity
 */
class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        mBtnToPlay.setOnClickListener {
            startActivity<VideoPlayerActivity>(
                    "url" to mEtLink.text.toString(),
                    "title" to mEtTitle.text.toString()
            )
        }
    }
}