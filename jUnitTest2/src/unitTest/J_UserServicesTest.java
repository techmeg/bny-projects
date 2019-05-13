package unitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entities.J_User;
import services.J_UserServices;

public class J_UserServicesTest {


	@Test
	public final void testLogin() {
		//test case #1 -- email/password exists
		J_UserServices js = new J_UserServices();
		J_User user = new J_User();
		user.setEmail("mlp@nyc.rr.com");
		user.setPassword("password");
//		boolean expected = js.login(user); these statements can be replaced by below
//		assertTrue(expected);
		assertTrue(js.login(user));
		
		//test case#2 -- email/password do not exist
		js = new J_UserServices();
		user = new J_User();
		user.setEmail("xyz@jjj");
		user.setPassword("password");
		assertFalse(js.login(user));
		
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAddUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testRemoveUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetUserByEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUsersByState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUsersByZip() {
		fail("Not yet implemented"); // TODO
	}

}
