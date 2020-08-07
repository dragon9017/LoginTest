package com.logintest.logintest.modal.service.userService;

import org.springframework.stereotype.Service;

/**
 * @Auther lby
 * @Date 2020/8/7
 */

public interface UserService {
    /**
     * 获取用户权限
     */
    String SelectPowerById(Integer id);
}
