package com.baizhi.serviceimp;

import com.baizhi.dao.PictureMapper;
import com.baizhi.entity.Picture;
import com.baizhi.service.service_dml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class serviceimp_dml implements service_dml {
    @Autowired
    private PictureMapper pm;

    @Override
    public int addByPicture(Picture pc) {

        int insert = pm.insert(pc);
        return insert;
    }
}
