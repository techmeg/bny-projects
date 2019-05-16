package bnym.casestudy.controllers;

import java.text.SimpleDateFormat;
/*
 * 
 * author margaret parsons
 * 
 */

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Contest;
import bnym.casestudy.services.ContestDAO;

@Controller
public class ContestController {

	@Autowired
	ContestDAO contestservices;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// change format from entry format of 01/01/1980 => 1980-01-01 which Java
		// recognizes
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "deadline", new CustomDateEditor(sdf, false));
	}

	// This controller shows the admin the contest list, with links for editing and
	// deleting

	@RequestMapping("/admin/showContests")
	public ModelAndView showContests() {
		ModelAndView mav = new ModelAndView("showcontests");
		List<Contest> contestList = contestservices.getAllContests();
		mav.addObject("contestList", contestList);
		return mav;
	}

	// This controller is linked to button on Contest List (showcontests.jsp) and
	// allows admin to create a contest

	@RequestMapping("/admin/createContest")
	public ModelAndView createContest(Model contest) {
		contest.addAttribute("contest", new Contest());
		ModelAndView mav = new ModelAndView("createcontest");
		return mav;
	}

	// This controller saves the contest created in the above action (from
	// createcontest.jsp)

	@RequestMapping(value = "/admin/saveContest", method = RequestMethod.POST)
	public ModelAndView saveContest(@Valid @ModelAttribute("contest") Contest contest, BindingResult result) {
		// @ModelAttribute allows you to bring in all the data and match it up to your
		// class Contest

		if (result.hasErrors()) {// return user to form if there are errors instead of Error Form
			ModelAndView model = new ModelAndView("admin/saveContest");
			model.addObject("message", "There is a problem with your entry, try again.");
			return model;
		}
		contestservices.saveContest(contest);
		contestservices.getAllContests().add(contest);

		ModelAndView model = new ModelAndView("contestsuccess");
		model.addObject("createsuccess", "Contest has been successfully created.");
		return model;
	}

	// This controller brings up the editcontest.jsp form for contest updating

	@RequestMapping(value = "/admin/updateContest/{id}", method = RequestMethod.GET)
	public ModelAndView showEditContestForm(@PathVariable long id) {
		Contest contest = contestservices.getContestById(id);
		ModelAndView model = new ModelAndView("editcontest");
		model.addObject("contest", contest);
		// "contest" is the name of the model attribute being sent to editContest form;
		// is an identifier for one record
		return model;
	}

	// This controller saves the updates made in the above action

	@RequestMapping(value = "admin/editContest", method = RequestMethod.POST)
	public ModelAndView saveEditedContest(@ModelAttribute Contest contest, BindingResult result) {
		if (result.hasErrors()) {
			System.out.print(result.toString());
		}
		contestservices.saveContest(contest);
		return new ModelAndView("redirect:/admin/showContests");
	}

	// This controller deletes a contest, prompted by link in "showcontests.jsp"

	@RequestMapping("admin/deleteContest/{id}")
	public ModelAndView deleteContest(@PathVariable long id) {
		contestservices.deleteContestById(id);
		ModelAndView model = new ModelAndView("redirect:/admin/showContests");
		model.addObject("ContestList", contestservices.getAllContests());
		return model;

	}

	public void startNewContest() {

		// CODE TO COME.....

		// when deadline is reached
		// count votes
		// pick winner
		// store winner info in contest
		// replace pictures with new contest pictures
		// replace contest blurb with next contest blurb
		// refresh last three winners sidebar pix 

	}

	
}
