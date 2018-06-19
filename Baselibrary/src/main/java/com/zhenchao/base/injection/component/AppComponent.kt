package com.zhenchao.base.injection.component

import android.content.Context
import com.zhenchao.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by lida on 2018/6/19.
 */
@Component(modules = [AppModule::class])
@Singleton
interface AppComponent {
    fun context():Context
}