package com.itmayiedu.controller;

import com.itmayiedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/regit")
    public String regit(String name, String pwd) {
        return userService.regit(name, pwd);
    }

    @RequestMapping("/get")
    public String get(Long userId) {
        return userService.get(userId);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
