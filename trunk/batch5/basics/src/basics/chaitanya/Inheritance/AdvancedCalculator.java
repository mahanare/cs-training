package basics.chaitanya.Inheritance;

import basics.chaitanya.Calculator;

public class AdvancedCalculator extends Calculator {

	@Override
	public int addOperation(int a, int b) {
		System.out.println("ADVANCED CALCULATOR");
		return super.addOperation(a, b);
	}
	
	
}
