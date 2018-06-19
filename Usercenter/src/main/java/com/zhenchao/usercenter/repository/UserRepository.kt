package com.zhenchao.usercenter.repository

import com.zhenchao.base.data.net.RetrofitFactory
import com.zhenchao.base.data.protocol.Result
import com.zhenchao.usercenter.data.api.UserApi
import rx.Observable
import javax.inject.Inject

/**
 * Created by lida on 2018/6/19.
 */
class UserRepository @Inject constructor(){

    fun register(mobile: String, pwd: String, verifyCode: String): Observable<Result<Any>> {
        val map = mapOf(
                "mobilephone" to "15067080345",
                "version" to "1.0.0",
                "channel" to "2"
        )

        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(map)
    }
}