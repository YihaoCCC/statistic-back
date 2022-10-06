package com.example.statisticback.dao;

import com.example.statisticback.entity.Dept;
import com.example.statisticback.entity.User;

public interface DeptDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

}