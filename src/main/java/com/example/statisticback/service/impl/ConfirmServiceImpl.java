package com.example.statisticback.service.impl;

import com.example.statisticback.dao.ConfirmDao;
import com.example.statisticback.entity.Confirm;
import com.example.statisticback.entity.Respose.Responce;
import com.example.statisticback.service.ConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class ConfirmServiceImpl implements ConfirmService {

    @Autowired
    private ConfirmDao confirmDao;

    @Override
    public Responce sureConfirm(Confirm confirm) {
        Date date = new Date();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse("15:00:00",dtf);
        if(LocalTime.now().isBefore(localTime)) {
            confirm.setTime(date);
            if(confirmDao.selectByUseIdAndTime(confirm) == null) {
                confirmDao.insert(confirm);
                return Responce.success("已确认用餐。",null);
            } else {
                return Responce.error("今天已确认用餐不可更改", null);
            }
        } else {
            return Responce.error("当前时间已超过15：00，请联系部门秘书统计！", null);
        }
    }
}
