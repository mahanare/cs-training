package in.careerscale.training.hari.oops.inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		AbstractWorld world = new ConcreteWorld();
		
		world.sayHello();
		
		
		HelloWorld hello=new MyHelloWorld();
		hello.sayHello();
		
	}

}
