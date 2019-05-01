/**
 * 
 */
package com.bnym.service.registration;

import java.util.List;

import com.bnym.entities.Applicant;
import com.bnym.entities.UserRegistration;

/**
 * @author margaret.parsons
 *
 */
public interface UserRegistrationService {
	
	public List<UserRegistration> getAllUsers();
	public UserRegistration getUserById(Long id);
	public boolean saveUserById(UserRegistration user);
	public boolean deleteUserById(Long id);

}
