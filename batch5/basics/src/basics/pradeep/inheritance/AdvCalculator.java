package basics.pradeep;

public class AdvCalculator extends Calculator {
	public AdvCalculator(int number1, int number2) {
		super(number1, number2);
	}

	@Override
	public int addNumbers(int number1, int number2) {
		System.out.println("overriding Calculator addNumbers method");// TODO
																		// Auto-generated
																		// method
																		// stub
		return super.addNumbers(number1, number2);
	}

	public AdvCalculator(int number1, String number2) {
		super(number1, number2);
	}

	@Override
	public int addNumbers(int number1, String number2) {
		System.out.println("overriding Calculator addNumbers method");// TODO
																		// Auto-generated
																		// method
																		// stub

		return super.addNumbers(number1, number2);
	}

}
