package com.booleandev.center.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.booleandev.center.server.mapper")
@SpringBootApplication
public class CenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterWebApplication.class, args);
    }

}
