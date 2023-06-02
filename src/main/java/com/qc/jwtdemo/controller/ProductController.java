package com.qc.jwtdemo.controller;

import com.qc.jwtdemo.entity.Product;
import com.qc.jwtdemo.service.ProductService;
import com.qc.jwtdemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author qiancheng
 * @date 2023/05/31
 */
@Controller
@Api(tags = "Product API")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/getInfo")
    @ApiOperation(value = "获取商品信息")
    public String getInfo(Model model){
        List<Product> products = productService.getProduct();
        model.addAttribute("products",products);
        return "product";
    }



}
