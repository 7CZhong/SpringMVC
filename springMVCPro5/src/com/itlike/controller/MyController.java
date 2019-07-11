package com.itlike.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.net.URLEncoder;


@Controller
public class MyController {

    @RequestMapping("/download/{filename:.+}")
    public ResponseEntity download(@PathVariable String filename, HttpSession session) throws Exception {
        System.out.println(filename);

        //获取文件路径
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/download/" + filename);

        //把文件读取到程序当中
        FileInputStream inputStream = new FileInputStream(realPath);
        byte[] body = new byte[inputStream.available()];
        inputStream.read(body);

        //创建相应头
        HttpHeaders httpHeaders = new HttpHeaders();
        //解读中文文件名
        filename = URLEncoder.encode(filename, "UTF-8");
        httpHeaders.add("Content-Disposition", "attachment;filename" + filename);

        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(body, httpHeaders, HttpStatus.OK);

        return responseEntity;
    }

}
