package com.qc.jwtdemo.controller;

import com.qc.jwtdemo.code.ResultCode;
import com.qc.jwtdemo.entity.LoginUser;
import com.qc.jwtdemo.entity.Product;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.service.LoginService;
import com.qc.jwtdemo.service.ProductService;
import com.qc.jwtdemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qiancheng
 * @date 2023/06/01
 */
@RestController
@Api(tags = "AndroidLogin API")
public class AndroidController {
    @Autowired
    LoginService loginService;
    @Autowired
    ProductService productService;

    @GetMapping("/andrGetInfo")
    @ApiOperation(value = "安卓获取商品信息")
    public Result getInfo(){
        List<Product> products = productService.getProduct();
        return Result.success(products);
    }

    @PostMapping("/login")
    @ApiOperation(value = "安卓登录接口")
    public Result login(@RequestBody User user) {
        LoginUser auth = loginService.auth(user.getUserName(),user.getPwd());
        if (Boolean.TRUE.equals(auth.getLogined())) {
            return Result.success(auth.getToken());
        }
        return Result.failure(ResultCode.ERROR);
    }

}
