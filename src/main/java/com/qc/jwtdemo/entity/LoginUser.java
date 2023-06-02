package com.qc.jwtdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * 登录用户实体
 * @author qiancheng
 * @date 2023/05/30
 */
@Data
public class LoginUser {

    private String username;
    @JsonIgnore
    private Boolean logined = Boolean.FALSE;
    private String token;
}
