package com.itlike.web.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itlike.domain.Goods;

@Controller
public class MyController {

	@RequestMapping("testModelAndView")
	public ModelAndView testModelAndView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "7czhong");
		modelAndView.setViewName("result.jsp");
		return modelAndView;
	}
	
	@RequestMapping("testModel")
	public String testModel(Model model) {
		model.addAttribute("name", "xiaoxi");
		
		Goods myGoods = new Goods();
		myGoods.setName("GameBoy");
		myGoods.setPrice(200.0);
		
		model.addAttribute(myGoods);
		
		System.out.println(model.asMap());
		
		//addAllAttribute Map
		HashMap<String, Object> hashMap = new HashMap<>();
		hashMap.put("name", "7CZhong");
		hashMap.put("pet", "pikachu");
		
		model.addAllAttributes(hashMap);
		
		System.out.println(model.asMap());
		
		//addAllAttribute Collection
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("777777CC");
		arrayList.add(200);
		
		model.addAllAttributes(arrayList);
		
		System.out.println(model.asMap());
		System.out.println(model.containsAttribute("pet"));
		
		return "result.jsp";
	}
}
