package com.kit.api.dao;

import com.kit.api.model.user.SystemUserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author songyan
 * @date 2020/12/26 14:16
 * @desc 用户操作数据库的基本方法
 **/
@Mapper
public interface UserDao {

    /**
     * 根据用户名获取用户信息（登录）
     * @param userName
     * @return
     */
    @Select("select t.username, t.password from sys_user t where t.username=#{userName}")
    SystemUserDo getLoginUser(@Param("userName") String userName);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    @Select("select t.username,t.user_id as userId from sys_user t where t.username=#{username}")
    SystemUserDo getUserByName(String username);
}
