package basics.chaitanya.Demo;

import basics.chaitanya.Inheritance.AdvancedCalculator;

import basics.hari.inheritance.AdvCalculator;

import basics.pradeep.LangConstructs;

public class InheritanceDemo {

	public void demoProtected() {
		AdvancedCalculator advCalc = new AdvancedCalculator();
		int result = advCalc.addOperation(2, 3);
		System.out.println("OUTPUT FROM INHERITANCE DEMO " + result);
	}

	public void hariCalculator() {
		AdvCalculator hariadvCalc = new AdvCalculator(1, 2);
		hariadvCalc.addNumbers(12, 13);
	}

	public void pradeepLangConst() {
		LangConstructs langconst = new LangConstructs();
		langconst.doWhileDemo();
	}

	public static void main(String[] args) {
		InheritanceDemo test = new InheritanceDemo();
		test.demoProtected();
		test.hariCalculator();
		test.pradeepLangConst();

	}

}
