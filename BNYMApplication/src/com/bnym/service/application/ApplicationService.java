package com.bnym.service.application;

import java.util.List;

import com.bnym.entities.Applicant;

/*
 * 
 * author meg parsons
 */


public interface ApplicationService {
	
	public List<Applicant> getAllApplications();
	public Applicant getApplicationById(Long id);
	public boolean saveApplication(Applicant applicant);
	public boolean deleteApplicationById(Long id);

}
