package in.careerscale.training.nospring;

public class Application {
	
	private HelloWorld hello;
	
	public void displayHello(){
		hello = new HelloWorldImpl();
		System.out.println(hello.sayHello("Hari"));
	}

}
