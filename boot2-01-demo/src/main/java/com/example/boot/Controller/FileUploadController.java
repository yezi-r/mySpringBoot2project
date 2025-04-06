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
import javax.servlet.http.HttpServletRequest;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.Phaser;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request)throws IOException {
        nickname = nickname.trim();
        System.out.println(nickname);
        System.out.println(photo.getOriginalFilename());
        System.out.println(photo.getContentType());
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo,path);
        return "上传成功";
    }

    public void saveFile(MultipartFile photo,String path)throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File file = new File(path + photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
