package com.example.boot.interceptor;

/**
 * ClassName:LoginInterceptor
 * Package:com.example.boot.interceptor
 * Description:
 *
 * @Author: SYY
 * @Create: 2025/4/6 - 22:23
 * @Version: v1.0
 */
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor preHandle");
        return true;
    }
}
