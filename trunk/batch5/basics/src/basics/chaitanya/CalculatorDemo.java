package basics.chaitanya;

public class CalculatorDemo {

	public static void main(String[] args) {
		// Using main class of HelloWorlds from basics.hari package.
		basics.hari.HelloWorld hello = new basics.hari.HelloWorld();
		hello.main(args); // Fix me, Why I am getting warning in this line ?
		
		Calculator Calc = new Calculator();

		int result1 = Calc.addOperation();
		System.out.println("Result without any input operand to Calculator = "
				+ result1);

		int result2_1 = Calc.addOperation(1, 51);
		System.out
				.println("Result of Calculator Addition operation with input operand = "
						+ result2_1);

		int result2_2 = Calc.subOperation();
		System.out
				.println("Result of Calculator Subtraction operation without any input operands = "
						+ result2_2);

		int result3 = Calc.subOperation(1, 10);
		System.out
				.println("Result of Calculator Subtraction operation with input operand = "
						+ result3);

		String result4 = Calc.addOperation(1, "+Chaitu");
		System.out
				.println("Result of calculator with String as one input operand = "
						+ result4);

		double result5 = Calc.subOperation(120, 1.23);
		System.out
				.println("Result of Calculator with Double data type as input operand = "
						+ result5);

		int result = Calc.addOperation(1, 'A');
		System.out
				.println("Result of calculator with Character as input operand = "
						+ result);

		// Using Bytemode(); which is written at JavaBasics class.
		basics.chaitanya.JavaBasics javabasics = new basics.chaitanya.JavaBasics();
		javabasics.ByteMode();	
	
	}
}
