package basics.chaitanya;

public class Calculator {

	public int a,b;
	public static int result1,result2;
	public static String character, result3;
	public static double d, result4;

	public Calculator() {
		System.out.println("Default contructor");
	}

	public Calculator(int a, int b) {
		this();
		System.out.println("Second constructor");
		this.a = a;
		this.b = b;
	}

	public Calculator(int a, String character) {
		this(a, Integer.parseInt(character));
		System.out.println("Third constructor");
	}

	public int addOperation() {
		return 10 + 20;
	}

	public int addOperation(int a, int b) {
		return a + b;
	}

	public String addOperation(int a, String character) {
		return a + character;
	}

	public int subOperation() {
		return a - b;
	}

	public int subOperation(int a, int b) {
		return a - b;
	}

	public double subOperation(int a, double d) {
		return a - d;
	}

	public static void main(String[] args) {
		Calculator Calc1 = new Calculator();
		Calculator Calc2 = new Calculator(1,2);
		Calculator Calc3 = new Calculator(1,"200");
		result1 = Calc1.addOperation();
		result2 = Calc1.subOperation(1, 1000);
		result3 = Calc2.addOperation(1, "+Chaitu");
		result4 = Calc3.subOperation(120, 1.23);
		System.out.println("RESULT WITHOUT ANY INPUT ARGUMENTS = " + result1);
		System.out.println("RESULT WITH INPUT ARGUMENTS = " + result2);
		System.out.println("RESULT WITH STRING AS ONE INPUT ARGUMENT = "
				+ result3);
		System.out
				.println("RESULT WITH DOUBLE DATATYPE AS ONE INPUT ARGUMENT = "
						+ result4);
	}

}
