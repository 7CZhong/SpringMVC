package com.itlike.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/first")
    public ModelAndView show(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","itlike");
        modelAndView.setViewName("redirect:/result.jsp");
        return modelAndView;
        
    }

    @RequestMapping("/second")
    public String show2() {
    	return "redirect:/result.jsp";
    }
    
}

