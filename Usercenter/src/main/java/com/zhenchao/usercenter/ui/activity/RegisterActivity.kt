package com.zhenchao.usercenter.ui.activity

import android.os.Bundle
import com.zhenchao.base.ext.onClick
import com.zhenchao.base.ui.activity.BaseMvpActivity

import com.zhenchao.usercenter.R
import com.zhenchao.usercenter.injection.component.DaggerUserComponent
import com.zhenchao.usercenter.injection.module.UserModule
import com.zhenchao.usercenter.presenter.RegisterPresenter
import com.zhenchao.usercenter.presenter.view.IRegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), IRegisterView {
    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(activityComponent).userModule(UserModule()).build().inject(this)
        mPresenter.view = this
    }

    override fun onRegisterResult(result: String) {
        toast(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnCommit.onClick { mPresenter.register("", "", "") }
    }

}
