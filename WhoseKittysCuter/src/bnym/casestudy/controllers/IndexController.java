package bnym.casestudy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.services.CatDAO;

@Controller
public class IndexController {
	
	@Autowired
	CatDAO catservices;

	@RequestMapping("/")
	//@RequestMapping("/", "/home", "/index")
	public ModelAndView getHomePage(Model model) {
		ModelAndView mav = new ModelAndView("/index");
		List<Cat> catList = catservices.getAllCats();
		mav.addObject("catList", catList);
		return mav;
	}
}
