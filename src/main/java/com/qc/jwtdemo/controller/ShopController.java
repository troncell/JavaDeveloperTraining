package com.qc.jwtdemo.controller;

import com.qc.jwtdemo.code.ResultCode;
import com.qc.jwtdemo.service.ProductService;
import com.qc.jwtdemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author qiancheng
 * @date 2023/05/31
 */
@RestController
@RequestMapping("/api")
@Api(tags = "Shop API")
public class ShopController {
    @Autowired
    ProductService productService;
    @GetMapping("/buy")
    @ApiOperation(value = "购物接口")
    public Result buy(@RequestParam("id") Long id) {

        productService.buy(id);
        return Result.success(ResultCode.SUCCESS);
    }
}
