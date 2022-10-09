package com.example.statisticback.dao;

import com.example.statisticback.entity.Confirm;

public interface ConfirmDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Confirm record);

    int insertSelective(Confirm record);

    Confirm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Confirm record);

    int updateByPrimaryKey(Confirm record);

    Confirm selectByUseIdAndTime(Confirm confirm);
}