package com.logintest.logintest.modal.mapper.userMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther lby
 * @Date 2020/8/7
 */
@Mapper
public interface UserMapper {
    /**
     * 获取用户权限
     */
    String SelectPowerById(Integer id);
}
