package com.macro.mall.tiny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallTinyApplication {

    public static void main(String[] args) {
        System.out.println("启动1");
        SpringApplication.run(MallTinyApplication.class, args);
    }

}
