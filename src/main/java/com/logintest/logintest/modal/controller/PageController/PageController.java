package com.logintest.logintest.modal.controller.PageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lby
 * date 2020-08-05
 */
@Controller
public class PageController {
    /**
     * 页面跳转
     */


    /**
     * 欢迎页
     */
    @GetMapping("/")
    public String WelcomeEvery(){
        return "pages/welcome";
    }

    /**
     * 登录页
     */
    @GetMapping("/login/login")
    public String Login(){
        return "pages/login";
    }

    /**
     * 跳转不同的地方
     */

    @GetMapping("/leval1/1")
    public String test01(){
        return "pages/leval1/1";
    }

    @GetMapping("/leval1/2")
    public String test02(){
        return "pages/leval1/2";
    }

    @GetMapping("/leval1/3")
    public String test03(){
        return "pages/leval1/3";
    }

    @GetMapping("/leval2/1")
    public String test04(){
        return "pages/leval2/1";
    }


    @GetMapping("/leval2/2")
    public String test05(){
        return "pages/leval2/2";
    }


    @GetMapping("/leval2/3")
    public String test06(){
        return "pages/leval2/3";
    }


    @GetMapping("/leval3/1")
    public String test13(){
        return "pages/leval3/1";
    }
    @GetMapping("/leval3/2")
    public String test12(){
        return "pages/leval3/2";
    }
    @GetMapping("/leval3/3")
    public String test11(){
        return "pages/leval3/3";
    }




}
