package com.spring.boot.example.mybatisDemo.domain;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2020/12/5 11:20
 * Copyright (c) 2020, zaodao All Rights Reserved.
 */
public class User {
    private Integer id;
    private String name;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}