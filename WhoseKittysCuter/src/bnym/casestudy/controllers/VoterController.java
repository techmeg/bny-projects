package bnym.casestudy.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Voter;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.VoterDAO;

@Controller
public class VoterController {

	@Autowired
	VoterDAO voterservices;

//	@RequestMapping(value = "/registercat", method = RequestMethod.POST)
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