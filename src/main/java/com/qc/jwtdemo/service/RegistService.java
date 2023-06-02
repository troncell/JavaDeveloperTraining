package com.qc.jwtdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.jwtdemo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @author qiancheng
 * @date 2023/05/30
 */

public interface RegistService extends IService<User> {
    User findByUserName(String username,String pwd);
}
