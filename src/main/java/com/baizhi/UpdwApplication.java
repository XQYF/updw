package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class UpdwApplication {

    public static void main(String[] args) {

        SpringApplication.run(UpdwApplication.class, args);
    }

}
