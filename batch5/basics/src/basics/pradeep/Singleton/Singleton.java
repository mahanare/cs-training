package basics.pradeep.Singleton;

public class Singleton {
	private static Singleton Single;

	private Singleton() {
		System.out.println("The Constructor of singleton");

	}

	public static Singleton receiveObject() {
		// Singleton single = new Singleton();
		// return singleton();
		if (Single == null) {
			System.out
					.println("If single is null its going to call constructor");
			Single = new Singleton();
		} else {
			System.out
					.println("single is not null so it is going to call new object");
		}

		return new Singleton();

	}

}
