package basics.harsha;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberCalculatorTest {

	@Test
	public void testAdd() { 
		assertEquals(0,NumberCalculator.add(0, 0));
	}

	@Test
	public void testSubtract() { 
		assertEquals(-2,NumberCalculator.subtract(3, 5));
	}
	@Test
	public void testMultiply() { 
		assertEquals(0,NumberCalculator.multiply(0, 10));
	}

	//how should i be testing the below two functions
	@Test
	public void testDivide() { 
		assertEquals(1.00,NumberCalculator.divide(1, 10),0.001);
	}
	@Test
	public void testDividebyZero() { 
		assertEquals(error,NumberCalculator.divide(10, 0));
	}
}
