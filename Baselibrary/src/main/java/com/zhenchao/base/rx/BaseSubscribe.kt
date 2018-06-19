package com.zhenchao.base.rx

import rx.Subscriber

/**
 * Created by lida on 2018/6/18.
 */
open class BaseSubscribe<T> : Subscriber<T>() {
    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }

}