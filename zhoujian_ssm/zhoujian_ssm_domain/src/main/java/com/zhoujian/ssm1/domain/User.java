package com.zhoujian.ssm1.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private String email;
    private String username;
    private String password;
    private String phoneNum;
    private Integer status;
    private String statusStr;

    public String getStatusStr() {
        if(status==1){
            statusStr = "开启";
        }else if(status ==0) {
            statusStr="关闭";
        }
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
