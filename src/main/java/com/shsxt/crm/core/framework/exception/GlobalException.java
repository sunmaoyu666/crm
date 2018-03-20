package com.shsxt.crm.core.framework.exception;

import com.shsxt.crm.core.framework.constant.ExceptionConstant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  全局 异常
 */

public class GlobalException extends RuntimeException {

    private String code;

    private String msg;

    public static GlobalException fail (String msg) {
        GlobalException ex = new GlobalException();
        ex.setCode(ExceptionConstant.DEFAULT_EX_CODE);
        ex.setMsg(msg);
        return ex;
    }

    public static GlobalException fail (String code ,String msg) {
        GlobalException ex = new GlobalException();
        ex.setCode(code);
        ex.setMsg(msg);
        return ex;
    }

    public static GlobalException failUnknownException () {
        GlobalException ex = new GlobalException();
        ex.setCode(ExceptionConstant.DEFAULT_EX_CODE);
        ex.setMsg(ExceptionConstant.DEFAULT_EX_MSG_UNKNOWN);
        return ex;
    }

    public static GlobalException failNetException () {
        GlobalException ex = new GlobalException();
        ex.setCode(ExceptionConstant.DEFAULT_EX_CODE);
        ex.setMsg(ExceptionConstant.DEFAULT_EX_MSG_NET);
        return ex;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
