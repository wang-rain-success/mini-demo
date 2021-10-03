package com.cn.wdy.demo.controller;


import com.cn.wdy.demo.component.ResponseVo;
import com.cn.wdy.demo.entity.User;
import com.cn.wdy.demo.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user", produces = "application/json")
public class loginController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    //    @NacosValue(value = "${USER_NAME}", autoRefreshed = true)
    private String username;

    @RequestMapping(value = "/login")
    public ResponseVo login(@RequestParam String uname, @RequestParam String upassword, HttpServletRequest request) {

        //根据用户名和密码获取用户
        User user = new User(uname, upassword);
        user = this.loginService.getUser(user);

        ResponseVo responseBody = new ResponseVo();

        if (user == null) {
            responseBody.setMessage("用户名或者密码不正确");
        } else {
            logger.debug("登录账户====" + user);
            request.getSession().setAttribute("user", user);
        }
        return responseBody;
    }

    @RequestMapping(value = "sayHello")
    public ResponseVo sayHello(HttpServletRequest request) {
        return new ResponseVo();
    }

}
