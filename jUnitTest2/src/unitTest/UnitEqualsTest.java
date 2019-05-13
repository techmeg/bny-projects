package unitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entities.J_User;

public class UnitEqualsTest {



	@Test
	public final void testEqualsObject1() {
		
			J_User expected = new J_User();
			expected.setEmail("mlp@nyc.rr.com");
			expected.setName("bob");
			expected.setPassword("password");
			expected.setAddress("address");
			expected.setState("NY");
			expected.setZipcode("8888");
			
			J_User actual = new J_User();
			actual.setEmail("mlp@nyc.rr.com");
			actual.setName("bob");
			actual.setPassword("password");
			actual.setAddress("address");
			actual.setState("NY");
			actual.setZipcode("8888");
			
			assertTrue(expected.equals(actual));
			
//		fail("Not yet implemented"); // TODO
	}

}
