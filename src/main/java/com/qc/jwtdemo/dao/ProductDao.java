package com.qc.jwtdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qc.jwtdemo.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qiancheng
 * @date 2023/05/31
 */
@Mapper
public interface ProductDao extends BaseMapper<Product> {
    void buy(@Param("id") Long id);
}
