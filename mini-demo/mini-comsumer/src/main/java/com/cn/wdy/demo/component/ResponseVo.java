package com.cn.wdy.demo.component;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口公共相应Vo
 */
public class ResponseVo {

    //错误码
    private String code = "00000000";
    //登录状态
    private boolean issuccess = true;

    private String message = "交易成功";

    private Map<String, Object> result = new HashMap<>();

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIssuccess() {
        return issuccess;
    }

    public void setIssuccess(boolean issuccess) {
        this.issuccess = issuccess;
    }
}
