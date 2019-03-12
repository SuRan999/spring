package com.baizhi.dao;

import com.baizhi.entity.Picture;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureMapper {
    int insert(Picture record);

    int insertSelective(Picture record);
}