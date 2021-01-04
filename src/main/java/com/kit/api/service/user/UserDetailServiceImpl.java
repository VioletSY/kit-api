package com.kit.api.service.user;

import com.kit.api.dao.UserDao;
import com.kit.api.model.user.SystemUserDo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @author songyan
 * @date 2021/1/2 20:59
 * @desc
 **/
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Resource
    UserDao dao;

    /**
     * 根据用户名登陆
     * @param userName
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SystemUserDo userDo = dao.getLoginUser(userName);
        if (userDo == null) {
            throw new UsernameNotFoundException("用户名或者密码不存在");
        }
        return new User(userDo.getUsername(), userDo.getPassword(), new ArrayList<>());
    }

    /**
     * 根据用户名获取用户信息
     * @param userName
     * @return
     */
    public SystemUserDo getUserByUsername(String userName) {
        return dao.getUserByName(userName);
    }
}
