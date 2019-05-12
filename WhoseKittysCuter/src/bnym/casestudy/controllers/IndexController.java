package bnym.casestudy.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contest;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.ContestDAO;

@Controller
public class IndexController {
	
	@Autowired
	CatDAO catservices;
	
	@Autowired
	ContestDAO contestservices;

	@RequestMapping("/")
	//@RequestMapping("/", "/home", "/index")
	public ModelAndView getHomePage(Model model) {
		
		//get current contest copy and list of cats to populate gallery
		ModelAndView mav = new ModelAndView("index");
		List<Contest> contestList = contestservices.getAllContests();
		try {
			if (contestList.isEmpty()) {
				mav.addObject("noNextContest", "Next contest theme is not available.");
				mav.addObject("noCurrentContest", "There is no current contest.");
				return mav;

			}
			Contest currentContest = new Contest();
			for (Contest c : contestList) {
				if (c.getStatus().equals("current")) {
					currentContest = c;
					mav.addObject("currentContest", currentContest);
				}
				else {
					System.out.println("NO CURRENT CONTEST");
				}
			}
			
			//determine next contest to populate side bar 

			Contest nextContest = new Contest();
			for (Contest c : contestList) {
				if (c.getStatus().equals("next")) {
					nextContest = c;
					mav.addObject("nextContest", nextContest);
					System.out.println(nextContest.getContestName() + "CONTEST NAME");
				}
				else {
				System.out.println("NO NEXT CONTEST");
				mav.addObject("nocontest", "Next contest theme is not available.");
				}
			
			}return mav;
		}catch (NullPointerException e) {

		
		}return mav;
		
	}
	
	
	//security additions
	@RequestMapping("/userpage")
	public ModelAndView getUserPage(Model model, Principal principal) {
		//model.addAttribute("message", "You are logged in as " + principal.getName());
		return new ModelAndView("user");
	}
	
	
	@RequestMapping("/adminpage")
	public ModelAndView getAdminPage(Model model, Principal principal) {
		//model.addAttribute("message", "You are logged in as " + principal.getName());
		return new ModelAndView("user");
	}
}
