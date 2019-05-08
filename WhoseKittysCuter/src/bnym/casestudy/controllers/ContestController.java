package bnym.casestudy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.services.ContestDAO;

@Controller
public class ContestController {
	
	@Autowired
	ContestDAO contestservices;
	
//	@RequestMapping("adminmenu")
//	public 
	

	
	
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
