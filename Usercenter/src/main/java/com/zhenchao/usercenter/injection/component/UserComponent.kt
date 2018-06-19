package com.zhenchao.usercenter.injection.component

import com.zhenchao.base.injection.PerComponentSocpe
import com.zhenchao.base.injection.component.ActivityComponent
import com.zhenchao.usercenter.injection.module.UserModule
import com.zhenchao.usercenter.ui.activity.RegisterActivity
import dagger.Component

/**
 * Created by lida on 2018/6/19.
 */
@PerComponentSocpe
@Component(dependencies = [ActivityComponent::class], modules = [(UserModule::class)])
interface UserComponent {
    fun inject(activity: RegisterActivity)
}