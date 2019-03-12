package com.baizhi.controller;

import com.baizhi.service.service_dml;
import com.baizhi.service.service_dql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

@RequestMapping("/download")
@RestController
public class DownFile_Controller {

    @Autowired
    private service_dql sq;
    @Autowired
    private service_dml sm;

    @RequestMapping("/down")
    public void downTest(String path, HttpServletRequest request, HttpServletResponse response){

        try{
            System.out.println("+++++++++++++++++++"+path);
            //获取文件路径
            String ppath = "F:/test" ;
            String realPath = request.getSession().getServletContext().getRealPath(ppath);
            //获取文件
            File file = new File(realPath,path);
            //根据文件后缀设置响应类型
            String substring = path.substring(path.lastIndexOf("."));
            response.setContentType(request.getSession().getServletContext().getMimeType(substring));
            //设置响应头
            response.setHeader("Content-disposition", "attachment;filename="+ URLEncoder.encode(path, "utf-8"));
            //响应
            FileInputStream inputStream = new FileInputStream(file);
            FileCopyUtils.copy(inputStream, response.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
