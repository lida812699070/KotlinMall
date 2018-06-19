package com.zhenchao.usercenter.injection.module

import com.zhenchao.usercenter.service.UserService
import com.zhenchao.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by lida on 2018/6/19.
 */
@Module
class UserModule {

    @Provides
    fun providesUserServices(service: UserServiceImpl): UserService {
        return service
    }
}