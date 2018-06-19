package com.zhenchao.base.common

import android.app.Application
import com.zhenchao.base.injection.component.AppComponent
import com.zhenchao.base.injection.component.DaggerAppComponent
import com.zhenchao.base.injection.module.AppModule

/**
 * Created by lida on 2018/6/19.
 */
class BaseApplication : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}