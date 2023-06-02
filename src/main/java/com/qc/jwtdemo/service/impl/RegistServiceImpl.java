package com.qc.jwtdemo.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qc.jwtdemo.dao.RegistDao;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.service.RegistService;
import org.springframework.stereotype.Service;

import java.util.Optional;


/**
 * @author qiancheng
 * @date 2023/05/30
 */
@Service
public class RegistServiceImpl extends ServiceImpl<RegistDao,User> implements RegistService {

    @Override
    public User findByUserName(String username,String pwd) {
        User one = this.getOne(new QueryWrapper<User>().eq("user_name", username).and(userQueryWrapper -> {
            userQueryWrapper.eq("pwd", pwd);
        }));
        return one;
    }
}
