package com.zhenchao.base.data.protocol;

public class Result<T> {
    private Boolean success;
    private String errorCode;
    private String errorMsg;
    private T map;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T getMap() {
        return map;
    }

    public void setMap(T map) {
        this.map = map;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", errorCode='" + errorCode + '\'' +
                ", map=" + map +
                '}';
    }
}