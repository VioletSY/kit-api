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

    private CODE code;
    private Object data;
    private int count;

    public ApiResultModel(Object data) {
        super();
        this.data = data;
        this.code = CODE.SUCCESS;
    }
    public ApiResultModel(Object data, CODE errorCode) {
        super();
        this.data = data;
        this.code = errorCode;
    }
    public ApiResultModel(Object data, int count, CODE code) {
        super();
        this.data = data;
        this.code = code;
        this.count = count;
    }

}
