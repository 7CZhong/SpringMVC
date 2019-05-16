package com.itlike.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController3 {

	@RequestMapping(value = { "testrequestmapping1", "testrequestmapping2" })
	public String testquest() {
		System.out.println("testquest");
		return "/second.jsp";
	}

	@RequestMapping(value = "testMethod", method = { RequestMethod.GET, RequestMethod.POST })
	public String testmethod() {
		System.out.println("testmethod");
		return "/second.jsp";
	}

	@RequestMapping(value = "testparams", params = { "name=7czhong", "age!=20" })
	public String testparams() {
		System.out.println("testparams");
		return "/second.jsp";
	}

	@RequestMapping(value = "testheaders", headers = { "Host=localhost:8080",
			"Referer=http://localhost:8080/springMVCPro2/requestmapping.jsp" })
	public String testheaders() {
		System.out.println("testheaders");
		return "/second.jsp";
	}

	@RequestMapping("testant/**/test")
	public String testant() {
		System.out.println("testant");
		return "/second.jsp";
	}

	@RequestMapping("rest/{id}")
	public String testrest(@PathVariable Integer id) {
		System.out.println("id:" + id);
		return "/second.jsp";
	}

	@RequestMapping(value = "testRestForm/{id}", method = RequestMethod.PUT)
	public String testrestform(@PathVariable Integer id) {
		System.out.println("testRestForm");
		System.out.println("id:" + id);
		return "redirect:/localsecond";
	}

	@RequestMapping("localsecond")
	public String localsecond() {
		return "second.jsp";
	}

	@RequestMapping("testHeader")
	public String testheader(@RequestHeader("Host") String host, @RequestHeader("Referer") String referer,
			@RequestHeader("Cookie") String cookie, @CookieValue("JSESSIONID") String sessionid) {
		System.out.println(host);
		System.out.println(referer);
		System.out.println(cookie);
		System.out.println(sessionid);
		return "second.jsp";
	}
}
