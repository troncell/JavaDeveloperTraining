package com.qc.jwtdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qc.jwtdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

/**
 * @author qiancheng
 * @date 2023/05/30
 */
@Mapper
public interface RegistDao extends BaseMapper<User> {


}
