package basics.hari.oops.inheritance.child;

import basics.hari.oops.inheritance.AbsHelloWorld;

public class HelloWorldImpl extends AbsHelloWorld {

	
	public HelloWorldImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public HelloWorldImpl(int number, String name){
	
		
		super(name, number);
		
		System.out.println("Within constructor of HelloWorldImpl with 2 parameters");
		
	}
	
	@Override
	public void sayHi(String name) {
		System.out.println("Hi from Derived class to AbsHelloWorld," +name);
		
	}



}
