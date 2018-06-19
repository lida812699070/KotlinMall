package com.zhenchao.base.injection.module

import android.app.Activity
import android.content.Context
import com.zhenchao.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by lida on 2018/6/19.
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesActivity(): Activity {
        return activity
    }
}