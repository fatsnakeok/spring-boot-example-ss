package com.spring.boot.example.mybatisDemo.mapper;

import com.spring.boot.example.mybatisDemo.domain.User;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020/12/5 11:25
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */
public interface UserMapper {
    User getUserById(Integer id);
}
