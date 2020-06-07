package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author songyan
 * @date 2020/6/7 17:00
 * @desc 系统用户
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser {

    /**
     * 主键
     */
    private String gid;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密碼
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

}
