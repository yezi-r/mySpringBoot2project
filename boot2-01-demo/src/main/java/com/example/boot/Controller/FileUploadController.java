package com.example.boot.Controller;

/**
 * ClassName:FileUploadController
 * Package:com.example.boot.Controller
 * Description:
 *
 * @Author: SYY
 * @Create: 2025/4/6 - 21:07
 * @Version: v1.0
 */

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpSerlvetRequest request)throws IOException {
        nickname = nickname.trim();
        System.out.println(nickname);
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        String path = request.getServletContext().getRealPath("/upload/");
        return "上传成功";
    }
}
