package in.careerscale.batch3.hari.oops.polymorphism;

public class Child  extends Parent{

	
	Child(){
		
		super();
	}
	/**
	 * in case of overriding:
	 * 1. inheritance is always involved
	 * 2. signature remains same.
	 */
	@Override
	public void sayHello(String name) {
	   System.out.println("within child sayHello method");
		super.sayHello(name);
	}
}
