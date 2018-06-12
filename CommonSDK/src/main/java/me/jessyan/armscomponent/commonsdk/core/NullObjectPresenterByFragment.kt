package me.jessyan.armscomponent.commonsdk.core

import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.mvp.IPresenter
import javax.inject.Inject

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/6/12
 * Description :
 */
@FragmentScope
class NullObjectPresenterByFragment
@Inject
constructor():IPresenter {
    override fun onStart() {
    }

    override fun onDestroy() {
    }
}