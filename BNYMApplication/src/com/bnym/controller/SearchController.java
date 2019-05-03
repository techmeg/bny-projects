package com.bnym.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bnym.entities.Applicant;
import com.bnym.repository.ApplicantRepository;



@Controller
public class SearchController {
	
	@Autowired
	ApplicantRepository applicantRepository;
	
	@PostMapping("/search")//shortcut way of writing mapping
	public ModelAndView searchProvider (
			@RequestParam String name,
			@RequestParam String city,
			RedirectAttributes redir) {
		List<Applicant> result = new ArrayList<Applicant>();
		
		result = applicantRepository.findBysNameIgnoreCaseAndSAddressCityIgnoreCase(name, city);
		System.out.println("Search size: "+result.size());
		
		//if there is a result
		if(result.size() !=0) {
			ModelAndView model = new ModelAndView("allApplications");
			model.addObject("applicationList", result);//model attribute in allApplications is "applicationList"
			model.addObject("recordFound", result.size() + " record(s) found");
			model.addObject("linktoAllAppls", "<a href=/BNYMApplication/showApplicants>All Applications</a>");
			//sending link as a string
			return model;
					
		}else {
			ModelAndView model = new ModelAndView("redirect:/showApplicants");
			redir.addFlashAttribute("noRecord",  "No record found");
			return model;
		}
		
	}
	

}
