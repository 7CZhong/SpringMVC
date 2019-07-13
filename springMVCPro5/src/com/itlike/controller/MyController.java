package com.itlike.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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

    @RequestMapping("/upload")
    public String upload(@RequestParam("file")CommonsMultipartFile file, HttpSession session) throws IOException {
        System.out.println(file.getContentType());
        System.out.println(file.getOriginalFilename()); //文件名
        System.out.println(file.getSize());
        System.out.println(file.getName());  //文件对应的属性名

        //确定上传路径
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/upload");
        //变成程序中的路径
        File uploadPath = new File(realPath);

        //如果路径不存在,创建一个
        if(!uploadPath.exists()) {
            uploadPath.mkdir();
        }
        //确认最终的路径  /文件夹/文件名
        String fileName = file.getOriginalFilename();
        uploadPath = new File(uploadPath + "/" + fileName);

        //开始上传
        file.transferTo(uploadPath);

        return "success";
    }

    @RequestMapping("/exception")
    public String exception() {
        int i = 1 / 0;
        return "success";
    }

    /*@ExceptionHandler(value = ArithmeticException.class)
    public String doexception(Exception ex) {
        System.out.println(ex.getMessage());
        return "error";
    }

    @ExceptionHandler(value = RuntimeException.class)
    public String doexception2(Exception ex) {
        System.out.println(ex.getMessage());
        return "error";
    }

    @ExceptionHandler(value = Exception.class)
    public String doexception3(Exception ex) {
        System.out.println(ex.getMessage());
        return "error";
    }*/

    @RequestMapping("/local")
    public String local() {
        return "local";
    }

}
