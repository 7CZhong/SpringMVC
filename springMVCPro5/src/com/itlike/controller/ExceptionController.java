package com.itlike.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = Exception.class)
    public String doexception(Exception ex) {
        System.out.println(ex.getMessage());
        return "error";
    }

}
