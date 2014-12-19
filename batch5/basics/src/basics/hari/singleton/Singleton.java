package basics.hari.singleton;

public class Singleton {

	private static Singleton single;

	private Singleton() {
		System.out.println("I am the constructor for Singleton");
	}

	public static Singleton getInstance() {

		// Singleton singleton = new Singleton();
		// return singleton;
		// return new Singleton();
		if (single == null) {
			System.out.println("single is null so calling constructor");
			single = new Singleton();
		}/*
		 * else { System.out
		 * .println("single is not null so going to use same object"); }
		 */
		return single;

	}

	public static void main1(String[] args) {
		Singleton single1 = new Singleton();
		Singleton single2 = new Singleton();
		Singleton single3 = new Singleton();

		// you can create more objects with main method in the singleton class.
		// It doesn't restrict because within same class we can use the private
		// constructor.

	}

}
