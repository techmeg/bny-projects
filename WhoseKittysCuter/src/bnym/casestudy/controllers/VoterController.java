package bnym.casestudy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Voter;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.VoterDAO;

@Controller
public class VoterController {

	@Autowired
	VoterDAO voterservices;
	
	@Autowired
	CatDAO catservices;
	
	@RequestMapping(value="voterRegistration/{id}", method= RequestMethod.GET)
	public ModelAndView registerVoter(@PathVariable long id) {
		Cat cat= catservices.getCatById(id);
		int numVotes = cat.getNumVotes() + 1;
		System.out.println( "Cat ID: " + id + "numVotes " + numVotes);

		cat.setNumVotes(numVotes);
		catservices.saveCat(cat);
		System.out.println("numVotes " + cat.getNumVotes());
		ModelAndView model = new ModelAndView("registerform");
		return model;
	}	
	
	@RequestMapping(value="/voterSuccess", method=RequestMethod.POST)
	public ModelAndView voterSuccess(@RequestParam String name, @RequestParam String email) {
		Voter voter = new Voter(name, email);
		voterservices.saveVoter(voter);
		return new ModelAndView("redirect:/");
	}

//	@RequestMapping(value = "/voterRegistration", method = RequestMethod.POST)
//	public ModelAndView validateVoter(@RequestParam Map<String, String> values) {
//
//		List<Voter> vList = voterservices.getAllVoters();
//
//		Voter v1 = new Voter(values.get("name"), values.get("email"));
//
//		v1.setPhoto(null);
//		v1.setContestId(0L);
//
//		for (Voter voter : vList) {
//			if (voter.getEmail().equals(v1.getEmail())) {
//				return new ModelAndView("error");
//			}
//			voterservices.saveVoter(v1);
//
//		}
//		ModelAndView mav = new ModelAndView("registercat");
//		return mav;
//
//	}



}
