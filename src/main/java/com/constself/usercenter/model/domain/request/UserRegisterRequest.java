package com.constself.usercenter.model.domain.request;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author G1ren
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 97736088483781522L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String  planetCode;
}
