package basics.harsha.designPatterns;

public class SingletonExampleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingletonExample s1 = SingletonExample.getInstance();
		SingletonExample s2 = SingletonExample.getInstance();
		SingletonExample s3 = SingletonExample.getInstance();
		SingletonExample s4 = SingletonExample.getInstance();

	}

}
