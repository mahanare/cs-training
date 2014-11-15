package basics.prashanth;

public class Datatypes {
	private byte byteNumber;
	private char myChar = 'A';
	private short shortNumber;
	private int intNumber;
	private float floatNumber;
	private double doubleNumber;
	private long longNumber;
	private boolean bolvalue;

	public void shortDemo() {
		shortNumber = 32760;
		System.out.println("short value is :" + shortNumber);
		shortNumber = (short) 32780;
		System.out.println("short value is:" + shortNumber);
		shortNumber = (short) -32780;
		System.out.println("short value is:" + shortNumber);
	}

	public void intDemo() {
		intNumber = 2147483646;
		System.out.println("int value is :" + intNumber);
		intNumber = (int) 2147483652l;
		System.out.println("int value is:" + intNumber);
		intNumber = (int) -2147483656l;
		System.out.println("int value is:" + intNumber);
	}

	public void floatDemo() {
		floatNumber = 54.6f;
		System.out.println("float value is :" + floatNumber);
		floatNumber = 2345.6f;
		System.out.println("float value is:" + floatNumber);
		floatNumber = -214748.56f;
		System.out.println("float value is:" + floatNumber);
	}

	public void doubleDemo() {
		doubleNumber = 214.46;
		System.out.println("double value is :" + doubleNumber);
		doubleNumber = 21464644545545454544836.52;
		System.out.println("double value is:" + doubleNumber);
		doubleNumber = -2147464654545454343434348.56;
		System.out.println("double value is:" + doubleNumber);
	}

	public void longDemo() {
		longNumber = 922453774;
		System.out.println("long value is :" + longNumber);
		longNumber = (long) 999987875347621448l;
		System.out.println("long value is:" + longNumber);
		longNumber = (long) -999914748466565825l;
		System.out.println("long value is:" + floatNumber);
	}

	public void booleanDemo() {
		short a = 45, b = 23;
		if (a > b) {
			bolvalue = true;
			System.out.println("boolean value is :" + bolvalue);
		} else {
			bolvalue = false;
			System.out.println("boolean value is:" + bolvalue);
		}
	}

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
		System.out.println("message value: " + message);

		message = message + " World";

		System.out.println("message value: " + message);

		System.out
				.println("byte value  is accessible in stringDemo because of scope is :"
						+ byteNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datatypes basics = new Datatypes();
		// basics.byteDemo();
		// basics.charDemo();
		// basics.stringDemo();
		// //basics.shortDemo();
		// basics.intDemo();
		// basics.longDemo();
		// basics.floatDemo();
		// basics.doubleDemo();
		basics.booleanDemo();

	}

}
