package com.zhenchao.base.injection

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy.RUNTIME
import javax.inject.Scope

/**
 * Created by lida on 2018/6/19.
 */
@Scope
@Documented
@Retention(RUNTIME)
annotation class PerComponentSocpe