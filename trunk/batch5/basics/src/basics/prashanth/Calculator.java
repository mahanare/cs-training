package basics.prashanth;

public class Calculator {

	protected int a;
	private int b;
	public String ch;

	public Calculator() {

		System.out.println("my contructor");
	}

	public Calculator(int a, int b) {
		this();
		System.out.println("my 2nd parameter constructor");
		this.a = a;
		this.b = b;

	}

	public int addNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		return a + b;
	}

	public int addNumbers(int a) {
		this.a = a;
		return a + 3;
	}

	protected int addNumbers() {

		return a + b;
	}

	private int addNumbers(int a, String b) {
		this.a = a;
		return a + 6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();

	}

}
