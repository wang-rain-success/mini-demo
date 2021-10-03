package com.cn.wdy.demo.service;


import com.cn.wdy.demo.dao.LoginDao;
import com.cn.wdy.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public User getUser(User user) {
        return this.loginDao.getUser(user);
    }


}
