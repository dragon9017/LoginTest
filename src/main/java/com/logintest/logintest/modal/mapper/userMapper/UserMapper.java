package com.logintest.logintest.modal.mapper.userMapper;

import com.logintest.logintest.modal.entiry.user.User;
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
    /**
     * 根据用户名查询信息
     */
    User SelectUserListByName(String name);
}
