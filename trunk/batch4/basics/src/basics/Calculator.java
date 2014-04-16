package basics;

public class Calculator {
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int substract(int a, int b){
		return a-b;
	}
	
	public int multiply(int a, int b){
		return a*b;
	}
	
	public int divide(int a, int b){
		return a/b;
	}

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 2));
		System.out.println(calc.substract(15, 3));
		System.out.println(calc.multiply(5, 2));
		System.out.println(calc.divide(50, 2));

	}

}
