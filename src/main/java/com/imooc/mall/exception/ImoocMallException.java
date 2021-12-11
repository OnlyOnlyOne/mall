package com.imooc.mall.exception;

/**
 * The type Imooc mall exception.
 * 描述： 统一异常
 */
public class ImoocMallException extends Exception{
    private final String message;
    private final Integer code;

    public ImoocMallException(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public ImoocMallException(ImoocMallExceptionEnum exceptionEnum) {
        this(exceptionEnum.msg, exceptionEnum.code);
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
