package com.baizhi;

import com.sun.glass.ui.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class application {

    public static void main(String[] args) {

        System.out.println("+++++++++++++");
        SpringApplication.run(application.class,args);
    }
}
