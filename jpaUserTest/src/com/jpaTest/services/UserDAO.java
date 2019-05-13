package com.jpaTest.services;


import com.jpaTest.entities.User;

public interface UserDAO {

	void createUser(User emp);
	
	void removeUser(int id);
	User findUser(int id);
	void updateUser(int id, String fname, String lname, String city);
}
