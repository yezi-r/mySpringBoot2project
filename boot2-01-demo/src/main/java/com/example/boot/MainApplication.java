package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:MainApplication
 * Package:com.example.boot
 * Description:
 *
 * @Author: SYY
 * @Create: 2025/3/6 - 1:12
 * @Version: v1.0
 */
@SpringBootApplication//这是一个SpringBoot的启动类
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
