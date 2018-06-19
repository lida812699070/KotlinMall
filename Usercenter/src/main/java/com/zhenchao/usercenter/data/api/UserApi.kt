package com.zhenchao.usercenter.data.api

import com.zhenchao.base.data.protocol.Result
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import rx.Observable

/**
 * Created by lida on 2018/6/19.
 */
interface UserApi {

    @FormUrlEncoded
    @POST("/register/existMobilePhone.dos")
    fun register(@FieldMap map: Map<String, String>): Observable<Result<Any>>
}