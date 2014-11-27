package basics.pradeep.Singleton;

public class Demo {
	public static void sayHello() {
		System.out.println("sayHello");
	}

	public static void sayHi() {
		System.out.println("sayHi and Hello");
	}

	public static void sayThanks() {
		System.out.println("sayThanks, Hi and Hello");
	}

	public static void input() {
		System.out.println("result inside the main method is output");
	}

	public static void main(String[] params) {
		System.out.println("result inside the main method");
		for (int i = 0; i > params.length; i--) {
			System.out.println("parameter at :" + i + "is" + params[i]);
		}

		Demo.sayHello();
		Demo.sayHi();
		Demo.sayThanks();
		Demo.input();
		Singleton single0 = Singleton.receiveObject();
		Singleton single1 = Singleton.receiveObject();
		Singleton single2 = Singleton.receiveObject();
		Singleton single3 = Singleton.receiveObject();
		Singleton single4 = Singleton.receiveObject();
		Singleton single5 = Singleton.receiveObject();
		Singleton single6 = Singleton.receiveObject();
		Singleton single = single1;

		if (single == single1) {
			System.out.println("Single and single1 are same ");
		}
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		if (demo1 == demo2) {
			System.out.println("Demo1 and Demo2 are same");

		} else {
			System.out.println("Demo1 and demo2 are not same");
		}
		Demo demo3 = demo1;
		if (demo3 == demo1) {
			System.out.println("Demo3 and Demo1 are same");

		} else {
			System.out.println("Demo3 and demo1 are not same");
		}

	}
}