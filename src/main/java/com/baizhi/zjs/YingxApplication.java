package com.baizhi.zjs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.baizhi.zjs.dao")
@SpringBootApplication
public class YingxApplication {

    public static void main(String[] args) {
        SpringApplication.run(YingxApplication.class, args);
    }

}
