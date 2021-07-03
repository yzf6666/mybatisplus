package com.javasm.springbootmybatisplus1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = {"com.javasm.springbootmybatisplus1.mapper"})
@SpringBootApplication
public class Springbootmybatisplus1Application {
    public static void main(String[] args) {
        SpringApplication.run(Springbootmybatisplus1Application.class, args);
    }

}
