package basics.chaitanya;

public class Calculator {

	public int a,b;
	public char c;
	public static String character;
	public static double d;

	public Calculator() {
		// System.out.println("Default contructor");
	}

	public Calculator(int a, int b) {
		// this();
		// System.out.println("Second constructor");
		this.a = a;
		this.b = b;
	}

	public Calculator(int a, String character) {
		this(a, Integer.parseInt(character));
		// System.out.println("Third constructor");
	}

	public void saveIntData(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("Numbers Saved are = " + this.a +"," + this.b);		
	}
	public int addOperation() {
		saveIntData(a,b);
		return a+b;	
	}

	public int addOperation(int a, int b) {
		saveIntData(a,b);
		return a + b;
	}

	public int addOperation(int a,char c) {
		int dummy = (int)c;
		saveIntData(a,dummy);
		return a + dummy;
	}

	public String addOperation(int a, String character) {
		return a + character;
	}

	public int subOperation() {
		return a - b;
	}

	public int subOperation(int a, int b) {
		saveIntData(a,b);
		return a - b;
	}

	public double subOperation(int a, double d) {
		return a - d;
	}

	public static void main(String[] args) {
		 Calculator Calc = new Calculator();
		// int result = Calc.addOperation(1,10);
		// System.out.println(+result);
	}
}
