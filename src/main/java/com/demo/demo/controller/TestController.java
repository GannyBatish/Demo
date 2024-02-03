package com.demo.demo.controller;


import com.demo.demo.entity.User;
import com.demo.demo.pojo.UserDto;
import com.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/user",produces = "application/json")
    public User createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }
}
