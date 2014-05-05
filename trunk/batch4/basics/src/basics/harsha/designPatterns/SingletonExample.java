package basics.harsha.designPatterns;

public class SingletonExample {

	private static SingletonExample s1 = null;

	private SingletonExample() {
		System.out.println("This is the constructor of SingletonExample");
	}

	public static SingletonExample getInstance() {
		if (s1 == null) {
			s1 = new SingletonExample();
			System.out.println("Object created");
		} else {
			System.out.println("Object not created");
		}

		return s1;
	}

}
