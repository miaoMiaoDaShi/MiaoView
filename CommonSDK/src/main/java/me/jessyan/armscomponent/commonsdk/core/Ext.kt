package me.jessyan.armscomponent.commonsdk.core

import android.app.Activity
import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import android.support.v4.app.DialogFragment
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import com.alibaba.android.arouter.launcher.ARouter
import com.jess.arms.http.imageloader.ImageConfig
import com.jess.arms.utils.ArmsUtils
import me.jessyan.armscomponent.commonsdk.imgaEngine.config.CommonImageConfigImpl

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :
 */

/**
 * 点击事件扩展方法
 */
fun View.onClick(method: () -> Unit): View {
    setOnClickListener { method.invoke() }
    return this
}

/**
 * 点击事件扩展方法
 */
fun View.onClick(listener: View.OnClickListener): View {
    setOnClickListener(listener)
    return this
}

/**
 * 设置View的可见
 */
fun View.visible(isVisible: Boolean): View {
    visibility = if (isVisible) View.VISIBLE else View.GONE
    return this
}

fun AppCompatActivity.showDialog(dialog: DialogFragment) {
    dialog.show(supportFragmentManager, "TAG")
}

fun Fragment.showDialog(dialog: DialogFragment) {
    dialog.show(fragmentManager, "TAG")
}

fun dismissDialog(dialog: DialogFragment) {
    dialog.dismiss()
}

/**
 *
 */
fun <T : ImageConfig> ImageView.loadImage(config: T) {
    ArmsUtils.obtainAppComponentFromContext(this.getContext())
            .imageLoader().loadImage(this.context, config)
}

fun ImageView.loadImage(url: String) {
    loadImage(url, 0)
}

fun ImageView.loadImage(url: String, placeholder: Int) {
    ArmsUtils.obtainAppComponentFromContext(this.getContext())
            .imageLoader().loadImage(this.context, CommonImageConfigImpl.builder()
                    .url(url)
                    .placeholder(placeholder)
                    .imageView(this)
                    .build())
}

fun Context.getTopActivity(): Activity {
    return ArmsUtils.obtainAppComponentFromContext(this).appManager().topActivity
}

/**
 * 通过uri  获取文件的路径
 */
fun Uri.getRealFilePath(context: Context): String? {
    val scheme = this.getScheme()
    var data: String? = null
    if (scheme == null)
        data = this.getPath()
    else if (ContentResolver.SCHEME_FILE == scheme) {
        data = this.getPath()
    } else if (ContentResolver.SCHEME_CONTENT == scheme) {
        val cursor = context.contentResolver.query(this, arrayOf(MediaStore.Images.ImageColumns.DATA), null, null, null)
        if (null != cursor) {
            if (cursor.moveToFirst()) {
                val index = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
                if (index > -1) {
                    data = cursor.getString(index)
                }
            }
            cursor.close()
        }
    }
    return data
}


/**
 * arouter  可能你想返回一个fragment
 */
fun ARouter.navigationx(path:String):Any{
    return  this.build(path).navigation()
}
