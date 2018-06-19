package com.zhenchao.base.injection.component

import android.app.Activity
import android.content.Context
import com.trello.rxlifecycle.LifecycleProvider
import com.zhenchao.base.injection.ActivitySocpe
import com.zhenchao.base.injection.module.ActivityModule
import com.zhenchao.base.injection.module.LifecycleProviderModule
import dagger.Component

/**
 * Created by lida on 2018/6/19.
 */
@ActivitySocpe
@Component(dependencies = [AppComponent::class], modules = [ActivityModule::class, LifecycleProviderModule::class])
interface ActivityComponent {

    fun activity(): Activity

    fun context(): Context

    fun lifecycleProvider(): LifecycleProvider<*>
}