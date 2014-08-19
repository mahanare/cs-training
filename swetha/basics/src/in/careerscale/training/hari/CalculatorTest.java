package in.careerscale.training.hari;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calci = new Calculator();
	@Test
	public void test() throws CalcException {
		
		int result = calci.add(2, 3);
		assertEquals(5, result);
	}
	
	@Test(expected = CalcException.class)
	public void testForException() throws CalcException{
		calci.add(101, 3);
	
	}

}
