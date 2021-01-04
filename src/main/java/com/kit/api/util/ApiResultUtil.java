package com.kit.api.util;

import com.kit.api.model.ApiResultModel;
import com.kit.api.model.CODE;

/**
 * @author songyan
 * @date 2021/1/2 22:06
 * @desc 返回模型
 **/
public class ApiResultUtil {

    /**
     * 操作成功返回值
     * @param data
     * @return
     */
    public static ApiResultModel success(Object data){
        ApiResultModel apiResultModel =new ApiResultModel();
        apiResultModel.setCode(CODE.SUCCESS);
        apiResultModel.setMsg("请求成功");
        apiResultModel.setSuccess(true);
        apiResultModel.setData(data);
        return apiResultModel;
    }

    /**
     * 操作失败返回值
     * @return
     */
    public static ApiResultModel error(){
        ApiResultModel apiResultModel =new ApiResultModel();
        apiResultModel.setCode(CODE.ERROR);
        apiResultModel.setMsg("请求失败");
        apiResultModel.setSuccess(false);
        return apiResultModel;
    }
}
