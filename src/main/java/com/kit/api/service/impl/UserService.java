package com.kit.api.service.impl;

import com.kit.api.model.SystemUser;
import com.kit.api.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author songyan
 * @date 2020/6/7 17:59
 * @desc 用户
 **/
@Service
public class UserService  implements IUserService {

    @Override
    public SystemUser getUserByUserName(String userName) {
        SystemUser user = new SystemUser();
        user.setGid("001");
        user.setUserName("admin");
        user.setPassword("0d640a406596c708629a7824d34d0e39");
        return user;
    }

}
