package com.example.statisticback.service.impl;

import com.example.statisticback.dao.ConfirmDao;
import com.example.statisticback.dao.DeptDao;
import com.example.statisticback.dao.UserDao;
import com.example.statisticback.entity.Confirm;
import com.example.statisticback.entity.Dept;
import com.example.statisticback.entity.Respose.Responce;
import com.example.statisticback.entity.User;
import com.example.statisticback.service.ConfirmService;
import com.example.statisticback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private DeptDao deptDao;

    @Autowired
    private ConfirmService confirmService;

    @Override
    public Responce userLogin(User user) {
        User user1 = userDao.selectByUsernameAndPassword(user);
        Confirm confirm = new Confirm();
        confirm.setUserId(user1.getId());
        if(user1 == null) {
            return Responce.error("用户名或密码错误", null);
        } else {
            Integer todayConfirm = confirmService.isTodayConfirm(confirm);
            Dept dept = deptDao.selectByPrimaryKey(user1.getDepartmentId());
            user1.setDept(dept);
            user1.setTodayIsConfirm(todayConfirm);
            return  Responce.success("登录成功！", user1);
        }
    }
    @Override
    public Responce getUserInfo(int userId) {
        Confirm confirm = new Confirm();
        confirm.setUserId(userId);
        User user = userDao.selectByPrimaryKey(userId);
        Dept dept = deptDao.selectByPrimaryKey(user.getDepartmentId());
        Integer todayConfirm = confirmService.isTodayConfirm(confirm);
        user.setTodayIsConfirm(todayConfirm);
        user.setDept(dept);
        return Responce.success("获取用户信息成功！",user);
    }
}
