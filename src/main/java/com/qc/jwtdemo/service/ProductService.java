package com.qc.jwtdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qc.jwtdemo.entity.Product;
import com.qc.jwtdemo.entity.User;

import java.util.List;

/**
 * @author qiancheng
 * @date 2023/05/31
 */
public interface ProductService extends IService<Product> {
    List<Product> getProduct();

    void buy(Long id);
}
