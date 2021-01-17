package com.online.huzu.entity;

import java.io.Serializable;

/**
 * @author sh
 * @version 1.0
 * @Date 2021/1/17 19:13
 */

public class user  implements Serializable {


    private String username;
    private String password;
    private String userType;

    public user() {
    }

    public user(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
