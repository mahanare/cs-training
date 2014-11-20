package basics.chaitanya;

import basics.chaitanya.*;
import basics.hari.*;

public class CalculatorDemo {

	private static int result1,result2_1,result2_2,result3;
	private static int charresult;
	private static String result4;
	private static double result5;

	public static void main(String[] args) {
		Calculator Calc = new Calculator();
		result1 = Calc.addOperation();
		System.out.println("Result without any input operand to Calculator = " + result1);
		
		result2_1 = Calc.addOperation(1,3);
		System.out.println("Result of Calculator Addition operation with input operand = " + result2_1);

		result2_2 = Calc.subOperation();
		System.out.println("Result of Calculator Subtraction operation without any input operands = " + result2_2);

		result3 = Calc.subOperation(1,10);
		System.out.println("Result of Calculator Subtraction operation with input operand = " + result3);
		
		result4 = Calc.addOperation(1, "+Chaitu");
		System.out.println("Result of calculator with String as one input operand = " + result4);
		
		result5 = Calc.subOperation(120, 1.23);	
		System.out.println("Result of Calculator with Double data type as input operand = " + result5);	

		charresult = Calc.addOperation(1,'A');
		System.out.println("Result of calculator with Character as input operand = " + charresult);
		
	}

}
