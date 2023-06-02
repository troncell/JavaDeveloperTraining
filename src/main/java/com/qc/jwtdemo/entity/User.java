package com.qc.jwtdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户实体
 * @author qiancheng
 * @date 2023/05/30
 */
@Data
@TableName("user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Long id;
    private String userName;
    private String pwd;
    private String name;

}
