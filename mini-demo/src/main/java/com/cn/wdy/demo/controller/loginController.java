package com.cn.wdy.demo.controller;


import com.cn.wdy.demo.entity.User;
import com.cn.wdy.demo.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login", produces = "application/json")
public class loginController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public String login(@RequestParam String uname,
                        @RequestParam String upassword
    ) {
        User  user = new User();
        user.setUname(uname);
        user.setUpassword(upassword);
        user = this.loginService.getUser(user);
        logger.debug("登录账户====" + user);
        return "hello world 8081";
    }

}
