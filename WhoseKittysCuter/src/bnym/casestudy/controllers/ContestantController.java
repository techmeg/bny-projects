package bnym.casestudy.controllers;

import java.util.List;

//Not using this controller at present...

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Contestant;
import bnym.casestudy.services.ContestantDAO;

@Controller
public class ContestantController {

	@Autowired
	ContestantDAO contestantservices;

	@RequestMapping(value = "/registercat", method = RequestMethod.POST)
	public ModelAndView validateContestant(@RequestParam Map<String, String> values) {

		List<Contestant> cList = contestantservices.getAllContestants();

		Contestant c1 = new Contestant(values.get("name"), values.get("email"));
		

		for (Contestant cont : cList) {
			if (cont.getEmail().equals(c1.getEmail())) {
				return new ModelAndView("error");
			}
			contestantservices.saveContestant(c1);

		}
		ModelAndView mav = new ModelAndView("registercat");
		mav.addObject("contestant", c1);
		return mav;

	}



}
