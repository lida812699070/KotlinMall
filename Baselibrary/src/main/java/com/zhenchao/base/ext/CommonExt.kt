package com.zhenchao.base.ext

import android.view.View
import com.trello.rxlifecycle.LifecycleProvider
import com.zhenchao.base.data.protocol.Result
import com.zhenchao.base.rx.BaseFuncBoolean
import com.zhenchao.base.rx.BaseSubscribe
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by lida on 2018/6/18.
 */
fun <T> Observable<T>.execute(subscribe: BaseSubscribe<T>, lifecycleProvider: LifecycleProvider<*>) {
    this.subscribeOn(Schedulers.io())
            .compose(lifecycleProvider.bindToLifecycle())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(subscribe)
}

fun View.onClick(listener: View.OnClickListener) {
    this.setOnClickListener(listener)
}

/**
 * 传入labmda表达式
 */
fun View.onClick(method: () -> Unit) {
    this.setOnClickListener {
        method()
    }
}

fun <T> Observable<Result<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}