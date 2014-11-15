package basics.hari;

/***
 * class name should always follow PASCAL case and the variables and methods
 * should follow CAMEL case.
 * 
 * @author harinath
 * 
 */
public class BasicDataTypes {

	private byte byteNumber;
	private char myChar = 'A';

	public void byteDemo() {

		byteNumber = 120;
		System.out.println("byte value is :" + byteNumber);

		byteNumber = (byte) 130;
		System.out.println("byte value is :" + byteNumber);

		byteNumber = (byte) -140;
		System.out.println("byte value is :" + byteNumber);
	}

	public void charDemo() {

		System.out.println("Char value " + myChar);

		System.out.println("int value " + (int) myChar);

	}

	public void stringDemo() {
		String message = "Hello";

		System.out.println("message value: " + message);

		message = message + " World";

		System.out.println("message value: " + message);

		System.out
				.println("byte value  is accessible in stringDemo because of scope is :"
						+ byteNumber);
	}

	// other data types are assignments

	public static void main(String[] args) {

		BasicDataTypes basics = new BasicDataTypes();
		basics.byteDemo();
		basics.charDemo();
		basics.stringDemo();

		Integer myInt = new Integer(100);

		String input = "100";
		Integer.parseInt(input);

		Short myShort;

		Long myLong;

		Double myDouble;

		Character character = new Character('A');

		Float myFloat;

	}

}
