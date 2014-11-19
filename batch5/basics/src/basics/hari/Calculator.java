package basics.hari;

/**
 * 
 * List of keywords.
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 */

/**
 * Class name should always be in PASCAL case and method, variable names should
 * be in camel case.
 * 
 * @author harinath
 * 
 */
public class Calculator {

	private int number1;
	private int number2;

	public String name;

	public Calculator() {
		// dummy constructor for compatibility.
		System.out.println("Default contructor");
	}

	public Calculator(int number1, int number2) {
		this();
		System.out.println("2nd constructor");
		this.number1 = number1;
		this.number2 = number2;

	}

	public Calculator(int number1, String number2) {
		this(number1, Integer.parseInt(number2));
		System.out.println("3rd constructor");
		// this.number2 = Integer.parseInt(number2);

	}

	private void saveNumbers(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	private int addNumbers() {
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
		Calculator calc = new Calculator();
		// calc.
	}
}
