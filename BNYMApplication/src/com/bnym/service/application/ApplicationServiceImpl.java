/**
 * 
 */
package com.bnym.service.application;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.entities.Applicant;
import com.bnym.repository.ApplicantRepository;

/**
 * @author margaret.parsons
 *
 */
@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicantRepository repository;
	//injection
	
	@Override
	public List<Applicant> getAllApplications() {
		//local copy of Applicant table
		List<Applicant> list = new ArrayList<Applicant>();
		for (Applicant applicant : repository.findAll()) {//repository is an Iterable class, not a list
			list.add(applicant);
		}
		return list;
	}

	@Override
	public Applicant getApplicationById(Long id) {
		Applicant applicant = repository.findById(id).get();
		return applicant;
	}

	@Override
	public boolean saveApplication(Applicant applicant) {
		try {
			repository.save(applicant);
			return true;
		}catch(Exception ex) {
		return false;
		}
	}

	@Override
	public boolean deleteApplicationById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}catch (Exception ex){
			return false;
		}
		
	}

}
