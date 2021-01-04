package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author songyan
 * @date 2020/6/7 20:40
 * @desc API接口返回数据模型
 **/
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ApiResultModel {

    private int code;
    private Object data;
    private boolean success;
    private String msg;

    public void setCode(CODE code){
        this.code = code.getCode();
        this.msg = code.getMsg();
    }
    public ApiResultModel(String msg, Object data) {
        super();
        this.data = data;
        this.success = true;
        this.code = CODE.SUCCESS.getCode();
        this.msg = CODE.SUCCESS.getMsg();
    }

    public ApiResultModel(Object data) {
        super();
        this.data = data;
        this.success = true;
        this.code = CODE.SUCCESS.getCode();
        this.msg = CODE.SUCCESS.getMsg();
    }

    public ApiResultModel(Object data, CODE errorCode) {
        super();
        this.data = data;
        this.success = false;
        this.code = CODE.SUCCESS.getCode();
        this.msg = CODE.SUCCESS.getMsg();
    }
}
