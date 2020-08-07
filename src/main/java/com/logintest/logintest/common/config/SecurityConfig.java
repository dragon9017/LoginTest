package com.logintest.logintest.common.config;

/**
 * @author lby
 * date 2020-08-05
 */


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 设置权限登录控制
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 实现权限控制的方法
     */
    @Override
    public void configure(HttpSecurity security) throws Exception {
        /**
         * 设置不同权限的人，访问不同的页面
         */
        security.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/leval3/**").hasRole("VIP1")
                .antMatchers("/leval2/**").hasRole("VIP2")
                .antMatchers("/leval3/**").hasRole("VIP3");


        /**
         * 当出现越级访问时，跳转到登录页面
         */
        security.formLogin().loginPage("http://localhost:8848/login/login");

    }



}
