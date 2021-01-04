package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.security.DenyAll;

/**
 * @author songyan
 * @date 2020/6/7 21:52
 * @desc 状态码
 **/
public enum CODE {

    /**
     * 操作成功
     */
    SUCCESS(200,"操作成功"),

    /**
     * 操作失败
     */
    ERROR(500,"操作失败");

    /**
     * 状态码
     */
    private int code;

    /**
     * 提示信息
     */
    private String msg;

    CODE(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
