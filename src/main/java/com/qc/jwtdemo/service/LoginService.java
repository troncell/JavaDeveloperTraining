package com.qc.jwtdemo.service;

import com.qc.jwtdemo.entity.LoginUser;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.utils.Result;

/**
 * @author qiancheng
 * @date 2023/05/30
 */
public interface LoginService {

    LoginUser auth(String userName, String pwd);
}
