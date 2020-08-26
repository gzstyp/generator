package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.fwtai"})
public class Launch extends SpringBootServletInitializer{

    public static void main(String[] args){
        SpringApplication.run(Launch.class,args);
        System.out.println("--应用启动成功--");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(Launch.class);
    }
}