package com.itlike.web.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itlike.domain.User;

@Controller
public class MyController {

	@RequestMapping("/first")
	public String myform(HttpServletRequest request) {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		System.out.println(id);
		System.out.println(name);
		return "/second.jsp";
	}
	
	@RequestMapping("/second")
	public String myform2(@RequestParam(value = "id", required = false, defaultValue = "100") Integer idkey, String name) {
		System.out.println(idkey);
		System.out.println(name);
		return "/second.jsp";
	}
	
	@RequestMapping("/myform")
	public String myform3(User user) {
		System.out.println(user);
		return "/second.jsp";
	}
	
	@RequestMapping("/myform2")
	public String myform4(User user) {
		System.out.println(user);
		return "/second.jsp";
	}
	
}
