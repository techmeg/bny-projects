/**
 * 
 */
package com.bnym.repository;

import org.springframework.data.repository.CrudRepository;

import com.bnym.entities.UserRegistration;

/**
 * @author margaret.parsons
 *
 */
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Long> {

}
