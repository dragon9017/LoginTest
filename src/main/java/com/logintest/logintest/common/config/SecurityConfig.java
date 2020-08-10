package com.logintest.logintest.common.config;

/**
 * @author lby
 * date 2020-08-05
 */


import com.logintest.logintest.modal.entiry.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.ui.Model;

/**
 * 设置权限登录控制
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 实现权限控制的方法
     */
   @Override
    protected void configure(HttpSecurity security) throws Exception {
        /**
         * 设置不同权限的人，访问不同的页面
         */
        security.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/leval1/**").hasRole("VIP1")
                .antMatchers("/leval2/**").hasRole("VIP2")
                .antMatchers("/leval3/**").hasRole("VIP3")
                .and()
                .csrf().disable();

       /**
        * 开启记住我功能
        */
       security.rememberMe().rememberMeParameter("remember");
        /**
         * 当出现越级访问时，跳转到登录页面
         */
        security.formLogin().loginPage("http://localhost:8848/login/login");
       /**
        * 开启注销功能
        */
//       security.logout().logoutUrl("/");
//       security.logout().logoutSuccessUrl("/");


   }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{

        /**
         * 给用户赋予权限
         */

//        auth.inMemoryAuthentication().withUser(user1.getName()).password(user1.getPassword()).authorities("VIP1");


    }


}
