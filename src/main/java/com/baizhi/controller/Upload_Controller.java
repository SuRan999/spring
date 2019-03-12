package com.baizhi.controller;

import com.baizhi.entity.Picture;
import com.baizhi.service.service_dml;
import com.baizhi.service.service_dql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.UUID;

@RequestMapping("/upload")
@RestController
public class Upload_Controller {

    @Autowired
    private service_dql sq;
    @Autowired
    private service_dml sm;

    @RequestMapping("/upload")
    public void downTest(MultipartFile file, Picture pc, HttpSession session){
        //获取原始文件名
        String filename = file.getOriginalFilename();
        String uuid = UUID.randomUUID().toString();
        String cpath = uuid+filename;
        String ppath = "F:/test" ;
        File dest = new File(ppath + "/" + cpath);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            pc.setpSrc(cpath);
            System.out.println("------------------------"+pc);
            int i = sm.addByPicture(pc);
            System.out.println("+++++++++++++++++++"+i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
