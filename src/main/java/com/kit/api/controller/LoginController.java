package com.kit.api.controller;

import com.kit.api.model.ApiResultModel;
import com.kit.api.model.CODE;
import com.kit.api.model.SystemUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songyan
 * @date 2020/6/7 20:36
 * @desc 登录
 **/
@RestController
public class LoginController {

    /**
     * 登录
     * @param user
     * @return
     */
    @RequestMapping("/doLogin")
    public Object doLogin(SystemUser user) {
        // 添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        try {
            // 进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            return new ApiResultModel("账号或密码错误！", CODE.ERROR);
        }
        return new ApiResultModel("登录成功");
    }
}
