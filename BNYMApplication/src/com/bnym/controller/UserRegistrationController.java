package com.bnym.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.bnym.entities.UserRegistration;

import com.bnym.service.registration.UserRegistrationService;


//this controller maps to 1)create new user form  2)to validate new user credentials
//and to edit or delete a user

@Controller
public class UserRegistrationController {

	@Autowired
	UserRegistrationService userRegistrationService;
	
	@RequestMapping("/newUser")
	public ModelAndView getRegistrationForm() {
		
		ModelAndView model = new ModelAndView("newuser");
		return model;
	}
	@RequestMapping(value="/editUser/{id}", method=RequestMethod.GET)
	public ModelAndView showEditUserForm(@PathVariable Long id) {
		UserRegistration user = userRegistrationService.getUserById(id);
		ModelAndView model = new ModelAndView ("editUser");
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping(value = "/editUser/{id}", method = RequestMethod.POST)
	public ModelAndView saveEditedUser(@ModelAttribute("user") UserRegistration user, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.toString());
		}
		userRegistrationService.saveUser(user);
		return new ModelAndView("redirect:/showUserList");
	};
	
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam long id) {
		userRegistrationService.deleteUserById(id);
		ModelAndView model = new ModelAndView("allUsers");
		model.addObject("allUsers", userRegistrationService.getAllUsers());
		return model;
	}

	@RequestMapping(value= "validatenew", method=RequestMethod.POST)
	public ModelAndView validatePassword(@RequestParam Map<String, String> userData, Model user) {
		user.addAttribute("user", new UserRegistration());

		//if email credential exists in database redirect to registration page again!
		//code will go below to set boolean to true or false
		boolean userDoesNotExists = true;
		
		//get credentials from the registration page
		
		String email = userData.get("email");
		String password = userData.get("password");
		String confirm = userData.get("confPassword");
		
		if(userDoesNotExists ) {
			
			//check to see if password entries match
			if(password.equals(confirm)) {

				UserRegistration newUser = new UserRegistration();
				newUser.setEmail(email);
				newUser.setPassword(password);
				
				//if passwords match, present admission form to user, save user, add user to userList
				userRegistrationService.saveUser(newUser);
				
				ModelAndView model = new ModelAndView("registrationSuccess");
					return model;
				
			//if passwords don't match, return to registration page and message user	
			}else {
				ModelAndView model = new ModelAndView("newuser");
				model.addObject("msg", "Your passwords did not match, try again.");
				return model;
			}
		//if user exists in database, go back to registration page	
		}else {
			ModelAndView model = new ModelAndView("newuser");
			model.addObject("msg", "User found with the same email, use another");
			return model;
		}
	}
	@RequestMapping("/showUserList")
	public ModelAndView showAllUsers() {
		ModelAndView model = new ModelAndView("allUsers");
		List<UserRegistration> userList = userRegistrationService.getAllUsers();
		model.addObject ("allUsers", userList);
		return model;
	}

	
}


