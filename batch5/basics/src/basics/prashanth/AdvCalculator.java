package basics.prashanth;

public class AdvCalculator extends Calculator {
	public int addNumbers(int a, int b) {
		System.out.println("overrides my original calculator method");
		return super.addNumbers(a, b);
	}

	public void superDemo() {

	}

	public void protectDemo() {
		a = 5;
		System.out.println("my protected variable from parent class is" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvCalculator advCal = new AdvCalculator();
		advCal.addNumbers(5, 3);
		advCal.protectDemo();
	}

}
