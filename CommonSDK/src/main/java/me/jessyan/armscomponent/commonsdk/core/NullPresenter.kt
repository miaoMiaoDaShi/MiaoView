package me.jessyan.armscomponent.commonsdk.core

import com.jess.arms.mvp.IPresenter

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/9
 * Description : 这个 仅仅是为了 处理 baseActivity  泛型  必传的问题
 */
class NullPresenter : IPresenter {
    override fun onStart() {

    }

    override fun onDestroy() {
    }
}