package com.example.statisticback.service.impl;

import com.example.statisticback.dao.UserDao;
import com.example.statisticback.entity.Respose.Responce;
import com.example.statisticback.entity.User;
import com.example.statisticback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Responce userLogin(User user) {
        User user1 = userDao.selectByUsernameAndPassword(user);
        if(user1 == null) {
            return Responce.error("用户名或密码错误", null);
        } else {
            return  Responce.success(
                    "登录成功！",
                    user1
            );
        }
    }
}