package com.bnym.service.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entities.UserRegistration;

@Service("userRegistrationService")
public class old_UserRegistrationService {
	
	private List<UserRegistration> allUsers = new ArrayList<UserRegistration>();
	public List<UserRegistration> getAllUsers(){
		return allUsers;
	}
}
