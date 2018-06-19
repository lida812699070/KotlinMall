package com.zhenchao.kotlinmall.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zhenchao.kotlinmall.R
import com.zhenchao.usercenter.ui.activity.RegisterActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Hi there!")
        startActivity<RegisterActivity>()
    }
}
