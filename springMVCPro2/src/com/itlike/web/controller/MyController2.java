package com.itlike.web.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {

	@RequestMapping("/convert")
	public ModelAndView testconvert(Integer age, Date date) {
		System.out.println(age);
		System.out.println(date);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/second.jsp");
		return modelAndView;
	}
	
}
