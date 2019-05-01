package com.bnym.service.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entities.Applicant;

@Service("applicationService")
public class old_ApplicationService {
	
	private List<Applicant> applicantList = new ArrayList<Applicant>();
	
	public List<Applicant> getAllApplicants() {
		return applicantList;
	}

}
