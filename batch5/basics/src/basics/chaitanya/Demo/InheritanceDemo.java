package basics.chaitanya.Demo;

import basics.chaitanya.Inheritance.AdvancedCalculator;

public class InheritanceDemo {

	public void demoProtected() {
		AdvancedCalculator advCalc = new AdvancedCalculator();
		int result = advCalc.addOperation(2, 3);
		System.out.println("OUTPUT FROM INHERITANCE DEMO " + result);
	}

	public static void main(String[] args) {
		InheritanceDemo test = new InheritanceDemo();
		test.demoProtected();

	}

}
