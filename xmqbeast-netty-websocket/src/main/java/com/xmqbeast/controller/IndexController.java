package com.xmqbeast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(){
		
		return "/index";
		
	}
	
	@RequestMapping(value = "/greeting")
	public ModelAndView test(ModelAndView mv) {
	    mv.setViewName("/index");
	    mv.addObject("title","欢迎使用Thymeleaf!");
	    return mv;
	}
}
