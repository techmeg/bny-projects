package bnym.casestudy.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.services.CatServices;

@Controller
public class AdminController {
	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}
	
	public void updateGallery() {}
	
	public Cat pickWinner() {
		//get list of cat contestants
//		CatServices catservice;
//		
//		List<Cat> contestantList = getAllCats();
//		for (Cat cat : contestantList)
		
		//review list to see which has the highest numVotes
		//return cat
		
		//code 
		
		return null;
	}

}
