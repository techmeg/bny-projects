package services;

import java.util.List;

import entities.J_User;

public interface J_UserDAOI {
	
	public boolean login(J_User j_user);
	
	public void addUser(String email, String password);
	
	public void removeUser(String email);
	
	public J_User getUserByEmail(String email);
	
	public List<J_User> findUsersByState(String state);
	
	public List <J_User> findUsersByZip(String zipcode);
	
}
