package bnym.casestudy.controllers;


import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Voter;
import bnym.casestudy.services.VoterDAO;


@Controller
public class VoterController {
	
	@Autowired
	VoterDAO voterservices;
	
	@RequestMapping(value="/registercat", method=RequestMethod.POST)
	public ModelAndView validateVoter(@RequestParam Map<String, String> values) {
			
		List<Voter> vList = voterservices.getAllVoters();

		Voter v1 = new Voter(values.get("name"), values.get("email"));
		
		v1.setPhoto(null);
		v1.setContestId(0L);
		
		for (Voter voter : vList) {
			if (voter.getEmail().equals(v1.getEmail())){
				return new ModelAndView("error");
			}
				voterservices.saveVoter(v1);
				
		}ModelAndView mav = new ModelAndView("registercat");
		return mav;

		
	}
}
