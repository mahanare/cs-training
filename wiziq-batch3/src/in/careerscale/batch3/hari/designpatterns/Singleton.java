package in.careerscale.batch3.hari.designpatterns;

public class Singleton {

	// static block is nothing to do with singleton, i mentioned to explain how
	// it works.
	static {
		System.out.println("within static block (anonymous)");
	}

	// private static int id=10;

	private static Singleton instance;

	public static Singleton getInstance() {

		if (instance == null) {
			instance = new Singleton();
		}
		return instance;

	}

	private Singleton() {
		System.out.println("within the constructor");
	}

}
