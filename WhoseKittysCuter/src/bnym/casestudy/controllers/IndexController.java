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
/*
 * 
 * author: meg parsons
 * 
 * 
 */
@Controller
public class IndexController {
	
	@Autowired
	CatDAO catservices;
	
	@Autowired
	ContestDAO contestservices;
	
	//THIS METHOD POPULATES THE HOME PAGE WITH COPY AND PHOTOS AND LEADER INFO

	@RequestMapping( value= {"/", "/index"})
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

			}else {
				Contest currentContest = new Contest();
				Cat catLeader = new Cat();
				String leader  = "no leader";
				int mostVotes = 0;
				
				//get current contest
				for (Contest c : contestList) {
					if (c.getStatus().equals("current")) {
						currentContest = c;
						mav.addObject("currentContest", currentContest);
						List <Cat> catList = catservices.getAllCats();
						mav.addObject("catList", catList);
						
						//get leader
						for(Cat cat: catList) {
							if(cat.getNumVotes()>mostVotes) {
								catLeader = cat;
								leader = catLeader.getcName();
								mostVotes = catLeader.getNumVotes();
								System.out.println("leader " +leader + "votes " + mostVotes);
								mav.addObject("leader", leader);
								mav.addObject("mostVotes", mostVotes);
							}
						}
					}
					else {
						System.out.println("NO CURRENT CONTEST");
					}
				}//determine next contest to populate side bar 
				Contest nextContest = new Contest();
				for (Contest c : contestList) {
					if (c.getStatus().equals("next")) {
						nextContest = c;
						mav.addObject("nextContest", nextContest);
					}
					else {
					System.out.println("NO NEXT CONTEST");
					mav.addObject("nocontest", "Next contest theme is not available.");
					}
				}
			}return mav;
		}catch (NullPointerException e) {

		
		}return mav;
		
	}
	//This maps to About Contest page
	@RequestMapping("/about")
	public ModelAndView getAboutPage(Model model) {
		return new ModelAndView("about");
	
	}
	//This maps to the Contact Us page
	@RequestMapping("/contactus")
	public ModelAndView getContactPage(Model model) {
		return new ModelAndView("contactus");
	
	}
	
	//security additions -- not in use as Admin is the only user
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
