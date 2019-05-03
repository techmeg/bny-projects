package com.bnym.controller;

import java.text.SimpleDateFormat;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entities.Applicant;
import com.bnym.service.application.ApplicationService;


@Controller
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;

	
	//this annotation looks for a particular data type (date in this case) 
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	//change format from entry format of 01/01/1980 => 1980-01-01 which Java recognizes
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(sdf, false));
	}

	@RequestMapping("apply")
	public ModelAndView getAdmissionForm(Model applicant) {
		
		applicant.addAttribute("applicant", new Applicant());
		
		ModelAndView mnv = new ModelAndView("newapplication");
	
		return mnv;
	}
	@RequestMapping("/deleteApplicant") 
	public ModelAndView deleteApplicant(@RequestParam long id) {
		applicationService.deleteApplicationById(id);
		ModelAndView model = new ModelAndView("allApplications");
		model.addObject("applicationList", applicationService.getAllApplications() );
		return model;
				
	}

	

	@RequestMapping(value="editApplication/{id}", method= RequestMethod.GET)
	public ModelAndView showEditApplicationForm(@PathVariable long id) {
		Applicant applicant = applicationService.getApplicationById(id);
		ModelAndView model = new ModelAndView("editApplication");
		model.addObject("applicationForm", applicant);
		//"applicationForm" is the name of the model attribute you are sending to editApplication form; is an identifier for one record
		return model;
	}
	
	
	@RequestMapping(value="editApplication/{id}", method = RequestMethod.POST)
	public ModelAndView saveEditedApplication(@ModelAttribute Applicant application, BindingResult result ) {
		if(result.hasErrors()) {
			System.out.print(result.toString());
		}
		applicationService.saveApplication(application);
		return new ModelAndView("redirect:/showApplicants");
	}
	
	@RequestMapping(value="/saveApplication", method=RequestMethod.POST)//step 3
	public ModelAndView submitAdmissionForm(
		@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {
		//@ModelAttribute allows you to bring in all the data and match it up to your class Applicant
		
			if(result.hasErrors()) {//return user to form if there are errors instead of Error Form
				ModelAndView model = new ModelAndView("newapplication");
				return model;
			}
			applicationService.saveApplication(applicant);
			applicationService.getAllApplications().add(applicant);
			ModelAndView model = new ModelAndView("applysuccess");
				return model;
	}
				

	@RequestMapping("/showApplicants")
	public ModelAndView showAllApplicants() {
		ModelAndView model = new ModelAndView("allApplications");
		List<Applicant> applicationList = applicationService.getAllApplications();
		model.addObject ("applicationList", applicationList);
		return model;
	}

}
