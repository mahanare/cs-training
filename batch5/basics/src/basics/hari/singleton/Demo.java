package basics.hari.singleton;

public class Demo {

	public static void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[] params) {
		System.out.println("inside main method");
		for (int i = 0; i < params.length; i++) {
			System.out.println("Parameter at :" + i + " is : " + params[i]);
		}
		Demo.sayHello();

		Singleton single = Singleton.getInstance();
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		Singleton single3 = Singleton.getInstance();
		Singleton single4 = Singleton.getInstance();
		Singleton single5 = Singleton.getInstance();
		Singleton single6 = Singleton.getInstance();

		if (single == single1) {
			System.out.println("single and single1 are same");
		}

		Demo demo1 = new Demo();
		Demo demo2 = new Demo();

		if (demo1 == demo2) {
			System.out.println("demo1 and demo2 are same");
		} else {
			System.out.println("demo1 and demo2 are not same");
		}

		Demo demo3 = demo1;

		if (demo1 == demo3) {
			System.out.println("demo1 and demo3 are same");
		} else {
			System.out.println("demo1 and demo3 are not same");
		}

	}

}
