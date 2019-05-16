package bnym.casestudy.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contestant;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.ContestDAO;
import bnym.casestudy.services.ContestantDAO;
/*
 * author: Meg Parsons
 * 
 * this controller uploads cat PHOTO and saves cat and contestant info 
 * 
 */

@RestController
public class UploadController {

	@Autowired
	CatDAO catservices;

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	ContestantDAO contestantservices;
	
	@Autowired
	ContestDAO contestservices;

	@RequestMapping(value="/registrationsuccess", method=RequestMethod.POST)
	public ModelAndView catRegistration (@RequestParam ("file") CommonsMultipartFile file, 
			HttpSession session, @RequestParam String name,
			@RequestParam String email, @RequestParam String cName, 
			@RequestParam String cBlurb, 
			ModelMap registration)throws Exception {
		
		if (!file.isEmpty()) {
			try {
	//set directory location to save images
			  	final String UPLOAD_DIRECTORY ="/images";  
		
				ServletContext context = session.getServletContext();
			    String path = context.getRealPath(UPLOAD_DIRECTORY);  
			    String filename = file.getOriginalFilename();  
			  
	//save photo info to location		  
			    byte[] bytes = file.getBytes(); 
			    
			    BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream( new File(path + File.separator + filename)));  
			    stream.write(bytes);  
			    stream.flush();  
			    stream.close();  
			    
	//save cat info	
		        Cat cat = new Cat();
		        cat.setcName(cName);
		        cat.setBlurb(cBlurb);
		        cat.setPhoto(filename);
		        cat.setNumVotes(1);
		    	catservices.saveCat(cat); 
		    	
    //save contestant(owner) info...catching a transient exception, no time to fix
		    	List<Contestant> ownerList = contestantservices.getAllContestants();
				Contestant owner = new Contestant(name,email);
 				System.out.println("OWNER " + owner.getName());
				for (Contestant o : ownerList) {
					if (o.getEmail().equals(owner.getEmail())) {
						return new ModelAndView("error");
					}else {
						contestantservices.saveContestant(owner);
						
					}
				}
//			this code does not work either...
//		    	Contestant contestant = new Contestant();
//		    	contestant.setName(name);
//		    	contestant.setEmail(email);
//		    	contestantservices.saveContestant(contestant);
//		    	
//		    	System.out.println(contestant.toString());
			
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
			return new ModelAndView("registrationsuccess","filesuccess", "Your kitty has been registered!"); 
	}
	
	}
   
	                    
	                    
	              
