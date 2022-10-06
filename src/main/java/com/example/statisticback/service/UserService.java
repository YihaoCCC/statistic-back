package com.example.statisticback.service;

import com.example.statisticback.entity.Respose.Responce;
import com.example.statisticback.entity.User;

public interface UserService {
    Responce userLogin(User user);
}
