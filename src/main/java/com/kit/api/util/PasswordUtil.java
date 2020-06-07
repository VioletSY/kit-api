package com.kit.api.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author songyan
 * @date 2020/6/7 22:12
 * @desc 密码加密
 **/
public class PasswordUtil {

    /**
     * 密码加密
     * @param username
     * @return
     */
    public static String encryption(String pwd, String username) {
        //加密方式
        String hashAlgorithmName = "MD5";
        //加密次数
        int hashInteractions = 1024;
        //盐值
        ByteSource salt = ByteSource.Util.bytes(username);
        return new SimpleHash(hashAlgorithmName, pwd, salt, hashInteractions).toHex();
    }

}
