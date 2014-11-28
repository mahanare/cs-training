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

}
