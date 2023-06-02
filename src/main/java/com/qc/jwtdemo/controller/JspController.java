package com.qc.jwtdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiancheng
 * @date 2023/05/30
 */
@Controller
@Api(tags = "Jsp Redirect API")
public class JspController {
    @RequestMapping("/")
    @ApiOperation(value = "Redirect login")
    public String login() {
        return "login";
    }
    @RequestMapping("/redirect/regist")
    @ApiOperation(value = "Redirect register")
    public String regist() {
        return "register";
    }
}
