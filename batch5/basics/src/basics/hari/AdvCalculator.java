package basics.hari;

/**
 * Inheritance:
 * 
 * Assignment:
 * 
 * Implement AdvancedCalculator with the following functionality. 1. use
 * constructor inheritance. Call Parent constructor from Child class. 2. demo
 * the super key word. This is similar to "this" keyword but to refer to parent
 * class.
 * protected, private, public scope explanation through code.
 * 
 * @author harinath
 * 
 */
public class AdvCalculator extends Calculator {

	public AdvCalculator(int number1, int number2) {
		super(number1, number2);

	}

	@Override
	public int addNumbers(int number1, int number2) {
		System.out.println("Overriding Calculator addNumbers method");
		return super.addNumbers(number1, number2);
	}

}
