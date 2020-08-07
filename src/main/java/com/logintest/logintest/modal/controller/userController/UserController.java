package com.logintest.logintest.modal.controller.userController;

import com.logintest.logintest.modal.service.userService.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Auther lby
 * @Date 2020/8/7
 */

/**
 * 用户控制
 */
@RestController
@RequestMapping("system")
@Slf4j
public class UserController {
   @Resource
    private UserService userService;
   @PostMapping("/user/getPower")
   private String SelectUserPower(@RequestBody Integer id){
       String s = userService.SelectPowerById(id);
       System.out.println(s);
       return s;
   }
}
