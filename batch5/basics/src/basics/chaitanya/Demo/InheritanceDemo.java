package basics.chaitanya.Demo;

import basics.chaitanya.Inheritance.AdvancedCalculator;

public class InheritanceDemo {

	public void demoProtected() {
		AdvancedCalculator advCalc = new AdvancedCalculator();
		advCalc.addOperation(2, 3);
	}

	public static void main(String[] args) {
		InheritanceDemo test = new InheritanceDemo();
		
		// System.out.println("OUTPUT FROM INHERITANCE DEMO " +test.demoProtected());
		

	}

}
