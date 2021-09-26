package com.cn.wdy.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login",produces = "application/json")
public class loginController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/1")
    public String login() {
        return "hello world 8081";
    }

}
