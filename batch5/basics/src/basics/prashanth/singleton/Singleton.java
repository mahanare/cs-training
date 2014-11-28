package basics.prashanth.singleton;

public class Singleton {
	private static Singleton single;

	Singleton() {
		System.out.println("my constructor");
	}

	public static Singleton getObject() {
		if (single == null) {
			System.out.println("single null so calling constructor");
			single = new Singleton();
		} else {
			System.out.println("single not  null so uses same obj");
		}
		return single;
		// return new Singleton();

	}
}
