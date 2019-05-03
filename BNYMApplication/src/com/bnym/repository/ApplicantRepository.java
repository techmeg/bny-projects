package com.bnym.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bnym.entities.Applicant;
/*
 * 
 * author meg parsons
 * 
 */
public interface ApplicantRepository extends CrudRepository<Applicant, Long> {
	
	//Case Insensitive
	List<Applicant> findBysNameIgnoreCaseAndSAddressCityIgnoreCase(String name, String city);
	//Case Sensitive
	List<Applicant> findBysNameAndSAddressCity(String name, String city);
	
	

}
