package com.qc.jwtdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 商品实体
 * @author qiancheng
 * @date 2023/05/31
 */
@Data
public class Product {
    @TableId
    private Long id;
    private String productName;
    private String productNo;
    private String productCategory;
    private Long productWare;
    private String brand;
}
