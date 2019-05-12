package bnym.casestudy.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entities.Cat;
import bnym.casestudy.entities.Contestant;
import bnym.casestudy.services.CatDAO;
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

	@RequestMapping(value="/registrationsuccess", method=RequestMethod.POST)
	public ModelAndView catRegistration ( @RequestParam ("file") CommonsMultipartFile file, 
			HttpSession session, @RequestParam String name,
			@RequestParam String email, @RequestParam String cName, 
			@RequestParam String cBlurb, @RequestParam Long contestId,
			ModelMap registration)throws Exception {
		
		  	final String UPLOAD_DIRECTORY ="/images";  
	
			ServletContext context = session.getServletContext();
		    String path = context.getRealPath(UPLOAD_DIRECTORY);  
		    String filename = file.getOriginalFilename();  
		  
		  
		    //change filename to one that pins to cat identity --how??

//		    System.out.println(path+"\\"+filename);
		  
		    byte[] bytes = file.getBytes(); 
		    
		    BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream( new File(path + File.separator + filename)));  
		    stream.write(bytes);  
		    stream.flush();  
		    stream.close();  
		
	
	        Cat cat = new Cat();
	        cat.setcName(cName);
	        cat.setBlurb(cBlurb);
	        cat.setPhoto(filename);
	        cat.setContestId(contestId);
	    	catservices.saveCat(cat); 

	    	Contestant contestant = new Contestant();
	    	contestant.setName(name);
	    	contestant.setEmail(email);
	    	contestant.setCat(cat);
	    	contestantservices.saveContestant(contestant);

	    	return new ModelAndView("registrationsuccess","filesuccess", "Your kitty has been registered!");  
	
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
	                    
	                    
	                }
