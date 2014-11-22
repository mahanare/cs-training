package basics.prashanth;

public class Calculator {

	public int a;
	public int b;
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

	public Calculator(int a, String b) {
		this(a, Integer.parseInt(b));
		System.out.println("my 3rd constructor");
		// this.b = Integer.parseInt(b);

	}

	public int addNumbers(int a, int b) {
		this.a = a;
		this.b = b;
		return a + b;
	}

	private int addNumbers(int a) {
		this.a = a;
		return a + 3;
	}

	int addNumbers() {
		a = 5;
		b = 3;
		return a + b;
	}

	protected int addNumbers(int a, String b) {
		this.a = a;
		return a + 6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();

	}

}
