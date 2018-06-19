package com.zhenchao.base.presenter

import com.trello.rxlifecycle.LifecycleProvider
import com.zhenchao.base.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by lida on 2018/6/18.
 */
open class BasePresenter<T : BaseView> {
    lateinit var view: T
    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

}