package basics.hari.spring;

public class Application {

	public static void main(String[] args) {

		HelloWorld hw = new HelloWorldImpl();

		System.out.println(hw.sayHello());

	}

}
