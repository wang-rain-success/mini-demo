package com.cn.wdy.demo.interceptor;

import com.cn.wdy.demo.component.ResponseVo;
import com.cn.wdy.demo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        logger.debug("==================================================");

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if (user == null) {
            logger.debug("登录超时，请重新登录");
            ResponseVo vo = new ResponseVo();
            vo.setIssuccess(false);
            vo.setMessage("登录超时，请重新登录");
            return false;
        }
        return true;
    }
}
