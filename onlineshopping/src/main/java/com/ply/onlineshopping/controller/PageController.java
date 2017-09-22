package com.ply.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ply.shoppingbackend.dao.CategoryDAO;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	 
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title" , "Home");
		mv.addObject("clickhome", Boolean.TRUE);
		mv.addObject("greeting","Welcome To Spring Web MVC");
		
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}

	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title" , "About Us");
		mv.addObject("clickabout", Boolean.TRUE);
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title" , "Contact Us");
		mv.addObject("clickcontact", Boolean.TRUE);
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
