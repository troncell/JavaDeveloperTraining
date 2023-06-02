package com.qc.jwtdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qc.jwtdemo.dao.ProductDao;
import com.qc.jwtdemo.dao.RegistDao;
import com.qc.jwtdemo.entity.Product;
import com.qc.jwtdemo.entity.User;
import com.qc.jwtdemo.service.ProductService;
import com.qc.jwtdemo.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiancheng
 * @date 2023/05/31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {

    @Autowired
    ProductDao productDao;
    @Override
    public List<Product> getProduct() {
        List<Product> list = this.list();
        return list;
    }

    @Override
    public void buy(Long id) {
        productDao.buy(id);
    }
}
