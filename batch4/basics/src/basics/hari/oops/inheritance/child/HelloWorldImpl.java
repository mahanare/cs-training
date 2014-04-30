package basics.hari.oops.inheritance.child;

import basics.hari.oops.inheritance.AbsHelloWorld;

public class HelloWorldImpl extends AbsHelloWorld {

	@Override
	public void sayHi(String name) {
		System.out.println("Hi from Derived class to AbsHelloWorld," +name);
		
	}



}
