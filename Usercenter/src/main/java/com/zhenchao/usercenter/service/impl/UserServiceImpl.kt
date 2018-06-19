package com.zhenchao.usercenter.service.impl

import com.zhenchao.base.rx.BaseFuncBoolean
import com.zhenchao.usercenter.repository.UserRepository
import com.zhenchao.usercenter.service.UserService
import rx.Observable
import javax.inject.Inject

/**
 * Created by lida on 2018/6/18.
 */
class UserServiceImpl @Inject constructor() : UserService {

    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return repository.register(mobile, pwd, verifyCode)
                .flatMap(BaseFuncBoolean())
    }
}