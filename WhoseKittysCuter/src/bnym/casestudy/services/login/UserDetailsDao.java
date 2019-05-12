/**
 * 
 */
package bnym.casestudy.services.login;

import org.springframework.data.repository.CrudRepository;

import bnym.casestudy.entities.User;

/**
 * @author ahmshahparan
 *
 */
public interface UserDetailsDao{
	User findUserByUsername(String username);
}
