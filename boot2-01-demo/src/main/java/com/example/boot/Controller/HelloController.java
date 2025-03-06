package com.example.boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HelloController
 * Package:com.example.boot.Controller
 * Description:
 *
 * @Author: SYY
 * @Create: 2025/3/6 - 16:50
 * @Version: v1.0
 */
@RestController //这是一个SpringBoot的控制器
public class HelloController {
//  http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(){
        return "你好呀！我的Spring Boot";
    }
}
