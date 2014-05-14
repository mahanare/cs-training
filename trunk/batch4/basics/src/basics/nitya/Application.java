package basics.nitya;

public class Application {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.sayHelloWorld("to nitya"));
		
		HelloWorld hello1 = new HelloWorld();
		System.out.println(hello1.sayDay(27));
		
		HelloWorld hello2 = new HelloWorld();
		System.out.println(hello2.sayMonth(7));

	}

}
