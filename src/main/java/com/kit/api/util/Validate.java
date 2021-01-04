package com.kit.api.util;

/**
 * @author songyan
 * @date 2021/1/3 21:10
 * @desc 校验类
 **/
public class Validate {

    public static boolean isNull(String str){
        if(str==null || "".equals(str)){
            return true;
        }
        return false;
    }
}
