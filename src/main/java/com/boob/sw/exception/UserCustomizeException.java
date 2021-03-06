package com.boob.sw.exception;

import com.boob.sw.enums.IMessageEnum;

/**
 * 用户账户异常
 */
public class UserCustomizeException extends RuntimeException {

    private Integer code;
    private String message;

    public UserCustomizeException(IMessageEnum iMessageEnum) {
        this.code = iMessageEnum.getCode();
        this.message = iMessageEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
