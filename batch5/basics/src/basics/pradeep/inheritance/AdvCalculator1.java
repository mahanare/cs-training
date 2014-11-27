package basics.pradeep.inheritance;

import basics.pradeep.Calculator;

public class AdvCalculator1 extends Calculator {
	public AdvCalculator1(int number1, int number2) {
		super(number1, number2);

	}

	public int addNumbers(int number1, int number2) {
		System.out.println("Overriding Calculator addNumbers method");
		return super.addNumbers(number1, number2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
