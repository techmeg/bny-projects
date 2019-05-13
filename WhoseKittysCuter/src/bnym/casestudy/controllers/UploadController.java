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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contest;
import bnym.casestudy.entities.Contestant;
import bnym.casestudy.services.CatDAO;
import bnym.casestudy.services.ContestDAO;
import bnym.casestudy.services.ContestantDAO;
/*
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
//set directory location to save images
		  	final String UPLOAD_DIRECTORY ="/images";  
	
			ServletContext context = session.getServletContext();
		    String path = context.getRealPath(UPLOAD_DIRECTORY);  
		    String filename = file.getOriginalFilename();  
		  

//		    System.out.println(path+"\\"+filename);
//save photo info to location		  
		    byte[] bytes = file.getBytes(); 
		    
		    BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream( new File(path + File.separator + filename)));  
		    stream.write(bytes);  
		    stream.flush();  
		    stream.close();  
//set identity of next contest		
			List<Contest> contestList = contestservices.getAllContests();

		    Contest nextContest = new Contest();
			for (Contest c : contestList) {
				if (c.getStatus().equals("next")) {
					nextContest = c;
		    }
		    
//save cat info	
	        Cat cat = new Cat();
	        cat.setcName(cName);
	        cat.setBlurb(cBlurb);
	        cat.setPhoto(filename);
	        cat.setContest(nextContest);
	    	catservices.saveCat(cat); 
	    	
	    	

//save contestant(owner) info
	    	Contestant contestant = new Contestant();
	    	contestant.setName(name);
	    	contestant.setEmail(email);
	    	contestant.setCat(cat);
	    	contestantservices.saveContestant(contestant);
	    	
	    	System.out.println(contestant.toString());

	    	
			}return new ModelAndView("registrationsuccess","filesuccess", "Your kitty has been registered!"); 
	}
	
	}
//	Unused effort at uploading (partial)
//	@RequestMapping(value = "/registrationsuccess123", method = RequestMethod.POST)
//	@ResponseBody
//	 public void handleFileUpload(@RequestParam("file") MultipartFile file) {
//	            if (!file.isEmpty()) {
//	                try {
//	                    String uploadsDir = "/uploads/";
//	                    System.out.println(request.getPathTranslated() + "getPathTranslated");
//	                    System.out.println(request.getContextPath() + "getContextPath");
//	                    System.out.println(request.getServletPath() + "getServletPath");
//	                    System.out.println(request.getServletContext() + " getServletContext");
//	                    String realPathtoUploads =  request.getServletContext().getRealPath(uploadsDir);
//	                    System.out.println(realPathtoUploads);
//	                    if(! new File(realPathtoUploads).exists())
//	                    {
//	                        new File(realPathtoUploads).mkdir();
//	                    }
//		                
//
//
//	                    String orgName = file.getOriginalFilename();
//	                    String filePath = realPathtoUploads + orgName;
//	                    System.out.println(filePath);
//	                    File dest = new File(filePath);
//	                    file.transferTo(dest);
//
//	                    
//	                }catch(Exception e) {
//	                	
//	                }
//	                }
//	            }
//	                    
	                    
	                    
	              
