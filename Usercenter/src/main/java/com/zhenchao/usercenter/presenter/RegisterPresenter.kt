package com.zhenchao.usercenter.presenter

import com.zhenchao.base.ext.execute
import com.zhenchao.base.presenter.BasePresenter
import com.zhenchao.base.rx.BaseSubscribe
import com.zhenchao.usercenter.presenter.view.IRegisterView
import com.zhenchao.usercenter.service.UserService
import javax.inject.Inject

/**
 * Created by lida on 2018/6/18.
 */
class RegisterPresenter @Inject constructor() : BasePresenter<IRegisterView>() {

    @Inject
    lateinit var service: UserService

    fun register(mobile: String, verifyCode: String, pwd: String) {
        /**
         * 业务逻辑
         */
        service.register(mobile, verifyCode, pwd)
                .execute(object : BaseSubscribe<Boolean>() {
                    override fun onNext(t: Boolean) {
                        if (t){
                            view.onRegisterResult("注册成功")
                            return
                        }
                        view.onRegisterResult("注册失败")
                    }

                    override fun onError(e: Throwable?) {
                        view.onRegisterResult("注册失败")
                    }
                }, lifecycleProvider)

    }

}