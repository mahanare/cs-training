package basics.hari;

public class Demo {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int result = calc.addNumbers(5, 10);

		System.out.println("Sum of 5, 10 is : " + result);

		basics.chaitanya.Calculator calc2 = new basics.chaitanya.Calculator();
		System.out.println(" result of substraction from chaitanya calc :"
				+ calc2.subOperation(12, 3));

	}
}
