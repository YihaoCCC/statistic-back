package com.example.statisticback.controller;

import com.example.statisticback.entity.Respose.Responce;
import com.example.statisticback.entity.User;
import com.example.statisticback.service.UserService;
import com.example.statisticback.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    private UserService userService =  new UserServiceImpl();



    @PostMapping("/user/login")
    private Responce userLogin(@RequestBody User user) {
        return userService.userLogin(user);
    }
}
