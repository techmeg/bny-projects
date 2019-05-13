package TestThis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestThisTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetNameAtIndex() {
		TestThis t = new TestThis();
		int input = 2;
		assertEquals("Tony", t.getNameAtIndex(input));
		input = 0;
		assertEquals("Mike", t.getNameAtIndex(input));
	}

	@Test
	public final void testAddName() {
		TestThis tt = new TestThis();
		String name = "Jared";
		tt.addName(name);
		String actual = tt.getNames().get(tt.getNames().size()-1);
//		String actual = tt.getNames().get(3);
		
		assertEquals(name, actual);
		assertNotNull(actual);
//		fail("Not yet implemented"); // TODO
	}


}
