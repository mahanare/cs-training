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
		double result = NumberCalculator.divide(1, 10);
		assertEquals(0.1,result,0.001);
	}
	@Test
	public void testDividebyZero() { 
		double result = NumberCalculator.divide(10, 0);
		assertEquals(Double.POSITIVE_INFINITY, result,0.000);
		//assertEquals(error,);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDividebyZeroForIntegers() { 
		try{
		int result = 10/0;
		fail("exception should have occurred before this line");
		}
		catch(ArithmeticException ae){
			
		}
		//assertEquals(Double.POSITIVE_INFINITY, result,0.000);
		//assertEquals(error,);
	}
}
