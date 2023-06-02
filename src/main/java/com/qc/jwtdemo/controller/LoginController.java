package com.qc.jwtdemo.controller;

import com.qc.jwtdemo.code.ResultCode;
import com.qc.jwtdemo.entity.LoginUser;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.service.LoginService;
import com.qc.jwtdemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author qiancheng
 * @date 2023/05/30
 */
@Controller
@RequestMapping("/")
@Api(tags = "Login API")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping ("/loginJsp")
    @ApiOperation(value = "登录接口")
    public String login(String username, String pwd, Model model) {
        LoginUser auth = loginService.auth(username,pwd);
        if (Boolean.TRUE.equals(auth.getLogined())) {
            model.addAttribute("token",auth.getToken());
            return "success";
        }
        return "loginError";
    }


}
