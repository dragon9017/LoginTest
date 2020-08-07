package com.logintest.logintest.modal.entiry.user;

/**
 * @Auther lby
 * @Date 2020/8/7
 */

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户表
 */
@Data
@AllArgsConstructor
public class User {
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * 主键
     */
    private Integer id;

    /**
     * 权限
     * 权限分为三个等级，1，2，3
     */
    private String power;
}
