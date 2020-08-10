package com.logintest.logintest.modal.controller.userController;

import com.logintest.logintest.modal.entiry.user.User;
import com.logintest.logintest.modal.service.userService.UserService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther lby
 * @Date 2020/8/7
 */

/**
 * 用户控制
 */
@Controller
@Slf4j
@RequestMapping("system")
public class UserController {
   @Resource
    private UserService userService;
   @GetMapping("/user/getPower")
   private String SelectUserPower(Integer id){
       String s = userService.SelectPowerById(id);
       System.out.println(s);
       return s;
   }
    /**
     * 用户登录(获取权限)
     */
    @PostMapping("/user/login")
    private String LoginTest(String name, String password, Model modeel) throws Exception{
        User user1 = userService.SelectUserListByName(name);
        if(user1!=null){
            String password1 = user1.getPassword();
            if (password1.equals(password)){
                System.out.println("用户名密码正确");
            }
            else {
                System.out.println("密码错误");
            }
        }
        else {
            System.out.println("不存在此人");
        }
        Integer newId=user1.getId();
        if (newId!=null) {
            String s = userService.SelectPowerById(newId);
            log.info(s);
            modeel.addAttribute("user",user1);
            return "pages/welcome";
        }
        return "pages/login";

    }
}
