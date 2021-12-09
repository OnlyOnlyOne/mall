package com.imooc.mall.common;

/**
 * The type Api rest response.
 * 通用返回对象
 */
public class ApiRestResponse<T> {

    private Integer status;

    private String msg;

    private T data;

    private static final int OK_CODE = 10000;

    private static final String OK_MSG = "SUCCESS";

    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiRestResponse() {
        this(OK_CODE, OK_MSG);
    }
}
