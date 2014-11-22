package basics.pradeep;

public class Calculator {
	private int number1;
	private int number2;
	public String name;

	public Calculator() {
		System.out.println("Default Character");

	}

	public Calculator(int number1, int number2) {
		System.out.println("first Character");
		this.number1 = number1;
		this.number2 = number2;
	}

	public Calculator(int number1, String number2) {
		this(number1, Integer.parseInt(number2));
		System.out.println("second Character");
		this.number2 = Integer.parseInt(number2);

	}

	private void saveNumbers(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	protected int addNumbers() {
		return number1 + number2;
	}

	public int addNumbers(int number1, int number2) {
		saveNumbers(number1, number2);
		return addNumbers();
	}

	public int addNumbers(int number1, int number2, int number3) {
		saveNumbers(number1, number2);
		return addNumbers() + number3;
	}

	public int addNumbers(int number1, String number2) {
		saveNumbers(number1, Integer.parseInt(number2));
		return addNumbers();

	}

	public static void main(String[] args) {
		Calculator Calc = new Calculator(12, "1");
		Calculator Calc1 = new Calculator(15, 2);

		// TODO Auto-generated method stub

	}

}
