package com.spring.boot.example.mybatisDemo.controller;

import com.spring.boot.example.mybatisDemo.domain.User;
import com.spring.boot.example.mybatisDemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020/12/5 11:52
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/getUserById")
    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
}
