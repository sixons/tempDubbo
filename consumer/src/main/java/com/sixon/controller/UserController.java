package com.sixon.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sixon.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("/user")
    public String userInfo(){
        return userService.getUser();
    }

}
