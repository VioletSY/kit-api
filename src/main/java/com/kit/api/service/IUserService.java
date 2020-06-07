package com.kit.api.service;

import com.kit.api.model.SystemUser;

/**
 * @author songyan
 * @date 2020/6/7 17:58
 * @desc 用户
 **/
public interface IUserService {

    /**
     * 根据用户名查找用户
     * @param userName 用户名
     * @return 用户详情
     */
    SystemUser getUserByUserName(String userName);
}
