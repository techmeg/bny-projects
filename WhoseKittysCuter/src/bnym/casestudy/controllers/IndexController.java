package bnym.casestudy.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	//@RequestMapping("/", "/home", "/index")
	public ModelAndView getHomePage(Model model) {
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}
}
