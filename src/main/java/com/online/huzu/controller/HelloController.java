package com.online.huzu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author sh
 * @version 1.0
 * @Date 2021/1/17 12:07
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }
    @RequestMapping("/register")
    public String register(@RequestParam Map<String,Object> map){
           String username = (String) map.get("username");
           String password = (String) map.get("password");
           String userType = (String) map.get("UserType");
           System.out.println("用户名:"+username+"/n密码:"+password+"/n用户类型:"+userType);
        return "redirect:index.html";
    }

}
