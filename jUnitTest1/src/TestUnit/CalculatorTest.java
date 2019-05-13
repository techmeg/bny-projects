package TestUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import JUnitTest1.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Calculator calc = new Calculator();
		int expectAdd;
		int actualAdd = calc.add(1, 2);
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
	public final void testAdd() {
//		int n = 1;
//		int m = 2;
//		int expected = 3;
//		Calculator calc = new Calculator();
//		int actual = calc.add(n,  m);
//		assertEquals(expected, actual);
		assertEquals(7, new Calculator().add(3,  4));
		
		assertNotEquals(7, new Calculator().add(3,  5));
		Calculator calc = null;
		assertNull(calc);
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSubtract() {
		int n = 6;
		int m = 3;
		int expected = 3;
		assertEquals(expected, new Calculator().subtract(n,  m));
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMultiply() {
		
		assertEquals(16, new Calculator().multiply(4,  4));
//		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDivide() {
		
		assertEquals(.25, new Calculator().divide(2,  8), 1e-15);
//		fail("Not yet implemented"); // TODO
	}

}
