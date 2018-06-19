package com.zhenchao.base.rx

import com.zhenchao.base.data.protocol.Result
import rx.Observable
import rx.functions.Func1

/**
 * Created by lida on 2018/6/19.
 */
class BaseFuncBoolean<T> : Func1<Result<T>, Observable<Boolean>> {
    override fun call(t: Result<T>): Observable<Boolean> {

        if (!t.success) {
            return Observable.error(BaseException(11, t.errorMsg))
        }
        return Observable.just(true)
    }
}