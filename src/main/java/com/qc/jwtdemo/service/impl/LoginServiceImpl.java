package com.qc.jwtdemo.service.impl;

import com.qc.jwtdemo.entity.LoginUser;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.service.LoginService;
import com.qc.jwtdemo.service.RegistService;
import com.qc.jwtdemo.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author qiancheng
 * @date 2023/05/30
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
    @Autowired
    RegistService registService;


    @Override
    public LoginUser auth(String userName,String pwd) {
        User user = registService.findByUserName(userName,pwd);
        LoginUser loginUser = new LoginUser();
        if (Objects.nonNull(user)) {
            HashMap<String, String> map = new HashMap<>();
            map.put("username",userName);
            String token = JwtUtil.generateToken(map);
            loginUser.setUsername(userName);
            loginUser.setLogined(Boolean.TRUE);
            loginUser.setToken(token);
            log.info(String.format("生成的token为：%s",token));
        }
        return loginUser;
    }
}
