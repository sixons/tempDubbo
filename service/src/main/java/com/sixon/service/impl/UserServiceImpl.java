package com.sixon.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sixon.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "hello";
    }
}
