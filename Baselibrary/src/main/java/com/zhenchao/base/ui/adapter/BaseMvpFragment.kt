package com.zhenchao.base.ui.adapter

import android.os.Bundle
import com.zhenchao.base.common.BaseApplication
import com.zhenchao.base.injection.component.ActivityComponent
import com.zhenchao.base.injection.component.DaggerActivityComponent
import com.zhenchao.base.injection.module.ActivityModule
import com.zhenchao.base.injection.module.LifecycleProviderModule
import com.zhenchao.base.presenter.BasePresenter
import com.zhenchao.base.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by lida on 2018/6/18.
 */
abstract class BaseMvpFragment<T : BasePresenter<*>> : BaseFragment(), BaseView {
    lateinit var activityComponent: ActivityComponent

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()
    }

    abstract fun injectComponent()

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
                .appComponent((activity?.application as BaseApplication).appComponent)
                .activityModule(ActivityModule(activity!!))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()
    }

    @Inject
    lateinit var mPresenter: T
}