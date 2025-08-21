package com.example.yunpicture.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -3670981186294959293L;
    /**
     * 请求账号
     */
    private String userAccount;

    /**
     * 请求密码
     */
    private String userPassword;

}
