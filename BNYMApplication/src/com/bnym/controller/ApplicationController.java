package com.bnym.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.bnym.service.application.old_ApplicationService;


@Controller
public class ApplicationController {
	
	@Autowired
	old_ApplicationService applicationService;

	
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
	
	@RequestMapping(value="/saveApplication", method=RequestMethod.POST)//step 3
	public ModelAndView submitAdmissionForm(
		@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {
		//@ModelAttribute allows you to bring in all the data and match it up to your class Applicant
		
			if(result.hasErrors()) {//return user to form if there are errors instead of Error Form
				ModelAndView model = new ModelAndView("newapplication");
				return model;
			}
			applicant.setId((long)applicationService.getAllApplicants().size()+1);
			applicationService.getAllApplicants().add(applicant);
			ModelAndView model = new ModelAndView("applysuccess");
				return model;
				
	}@RequestMapping("/showApplicants")
	public ModelAndView showAllApplicants() {
		ModelAndView mav = new ModelAndView("allApplications");
		mav.addObject("allApplicants", applicationService.getAllApplicants());

		return mav;

	}
//	@RequestMapping("/showApplicant/{id}")
//	public ModelAndView showOneApplicant(@PathVariable Map<String, String> id) {
//	
//		System.out.println("id: "+id);
//		Applicant applicant = applicationService.getAllApplicants()
//				.stream()
//				.filter(appl -> (int) id == (appl.getId()))
//				.findAny()
//				.orElse(null);
//		
//		@RequestMapping("/goodbye/{userName}")
//		public ModelAndView goodbye(
//			@PathVariable Map<String, String> pathVar) {
//			String userName = pathVar.get("userName");
//		
//	}
	

	



}
