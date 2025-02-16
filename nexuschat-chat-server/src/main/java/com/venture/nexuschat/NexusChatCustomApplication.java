package com.venture.nexuschat;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan({"com.venture.nexuschat.**.mapper"})
@ServletComponentScan
public class NexusChatCustomApplication {
    public static void main(String[] args) {
        SpringApplication.run(NexusChatCustomApplication.class,args);
        System.out.println("Hello world!");
    }
}