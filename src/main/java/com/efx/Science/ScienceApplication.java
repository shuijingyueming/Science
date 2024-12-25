package com.efx.Science;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.efx.Science.dao")
public class ScienceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScienceApplication.class, args);
    }

}
