package com.ply.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome To Spring Web MVC");
		return mv;
	}

	
	
	
/*	Demonstration Purpose - How to passed value using url*/
	
//	@RequestMapping(value="/testrequestparam")
//	public ModelAndView testRequestParam(@RequestParam(value ="greeting", required = false) String greeting ){
//		if (greeting == null) {
//			greeting = "Hello There";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//	}
//	
//	@RequestMapping(value="/testpathvariable/{greeting}")
//	public ModelAndView testPathVariable(@PathVariable("greeting") String greeting ){
//		if (greeting == null) {
//			greeting = "Hello There";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//	}

}
