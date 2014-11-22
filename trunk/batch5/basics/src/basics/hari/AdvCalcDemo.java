package basics.hari;

import basics.hari.inheritance.AdvCalculator;

public class AdvCalcDemo {

	public static void main(String[] args) {
		AdvCalculator advCalc = new AdvCalculator(30, 40);
		int result = advCalc.addNumbers();

		System.out.println("Add using AdvCalculator : " + result);

	}

}
