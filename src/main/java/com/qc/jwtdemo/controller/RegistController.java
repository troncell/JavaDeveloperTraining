package com.qc.jwtdemo.controller;

import com.qc.jwtdemo.code.ResultCode;
import com.qc.jwtdemo.entity.LoginUser;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.service.LoginService;
import com.qc.jwtdemo.service.RegistService;
import com.qc.jwtdemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiancheng
 * @date 2023/05/30
 */
@RestController
@Api(tags = "Register API")
public class RegistController {

    @Autowired
    private RegistService registService;
    @PostMapping("/regist")
    @ApiOperation(value = "注册接口")
    public Result regist(String username,String pwd,String name) {
        User user = new User();
        user.setUserName(username);
        user.setPwd(pwd);
        user.setName(name);
        boolean save = registService.save(user);
        if (save) {
            return Result.success();
        }
        return Result.failure(ResultCode.ERROR);
    }



}
