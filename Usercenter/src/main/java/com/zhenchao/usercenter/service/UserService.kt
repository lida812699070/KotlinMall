package com.zhenchao.usercenter.service

import rx.Observable

/**
 * Created by lida on 2018/6/18.
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}