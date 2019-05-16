package com.itlike.web.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {

	@RequestMapping("/convert")
	public ModelAndView testconvert(Integer age, Date date, String name) {
		System.out.println(age);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
		System.out.println(name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/second.jsp");
		return modelAndView;
	}
	
}
