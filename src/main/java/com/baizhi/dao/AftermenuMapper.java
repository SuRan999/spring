package com.baizhi.dao;

import com.baizhi.entity.Aftermenu;

public interface AftermenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Aftermenu record);

    int insertSelective(Aftermenu record);

    Aftermenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Aftermenu record);

    int updateByPrimaryKey(Aftermenu record);
}