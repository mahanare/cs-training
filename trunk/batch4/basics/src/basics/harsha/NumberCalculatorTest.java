package basics.harsha;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.harsha.Exceptions.DenominatorZeroException;
import basics.harsha.Exceptions.NumberException;

public class NumberCalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(0, NumberCalculator.add(0, 0));
	}

	@Test
	public void testSubtract() {
		assertEquals(-2, NumberCalculator.subtract(3, 5));
	}

	@Test
	public void testMultiply() throws NumberException {
		assertEquals(0, NumberCalculator.multiplyPositive(0, 10));
	}

	@Test
	public void testDivide() {
		double result = NumberCalculator.divide(1, 10);
		assertEquals(0.1, result, 0.001);
	}

	@Test
	public void testDividebyZero() {
		double result = NumberCalculator.divide(10, 0);
		assertEquals(Double.POSITIVE_INFINITY, result, 0.000);
		// assertEquals(error,);
	}

	// how to pass this test
	@Test(expected = DenominatorZeroException.class)
	public void testDividebyPositiveByZero() throws DenominatorZeroException, NumberException {
		double result = NumberCalculator.dividePositive(10, 0);
		// assertEquals(Double.POSITIVE_INFINITY, result,0.000);

	}
}
