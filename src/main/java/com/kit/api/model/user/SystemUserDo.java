package com.kit.api.model.user;

import lombok.Data;

/**
 * @author songyan
 * @date 2021/1/2 21:03
 * @desc
 **/
@Data
public class SystemUserDo {
    private String username;
    private String password;
    private String userId;
}
