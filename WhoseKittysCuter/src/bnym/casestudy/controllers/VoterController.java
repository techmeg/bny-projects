package bnym.casestudy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contestant;
import bnym.casestudy.entities.Voter;
import bnym.casestudy.entities.Winner;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.ContestantDAO;
import bnym.casestudy.services.VoterDAO;

@Controller
public class VoterController {

	@Autowired
	VoterDAO voterservices;
	
	@Autowired
	CatDAO catservices;
	
	@Autowired
	ContestantDAO contestantservices;
	
	//Controller for "Pick Me" buttons to vote; updates number of votes and passes voter to registration form
	
	@RequestMapping(value="voterRegistration/{id}", method= RequestMethod.GET)
	public ModelAndView registerVoter(@PathVariable long id) {
		Cat cat= catservices.getCatById(id);
		int numVotes = cat.getNumVotes() + 1;
		System.out.println( "Cat ID: " + id + "numVotes " + numVotes);

		cat.setNumVotes(numVotes);
		catservices.saveCat(cat);
//		System.out.println("numVotes " + cat.getNumVotes());
		ModelAndView model = new ModelAndView("registerform");
		model.addObject("cat", cat);
		return model;
	}	
	
	//returns voter to home page, rolls back number of votes if voter already voted
	
	@RequestMapping(value="/voterSuccess/{id}", method=RequestMethod.POST)
	public ModelAndView voterSuccess(@RequestParam String name, @RequestParam String email, @PathVariable Long id) {
		List<Voter> voters = voterservices.getAllVoters();
		Voter voter = new Voter(name, email);
		Cat cat = catservices.getCatById(id);
		for (Voter v : voters) {
			if(!voter.getEmail().equals(v.getEmail())){
				voterservices.saveVoter(voter);
			}else {
				cat.setNumVotes(cat.getNumVotes()-1);
				catservices.saveCat(cat);
			}
		}
		
		return new ModelAndView("redirect:/");
	}
	

}







