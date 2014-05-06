package basics.hari.oops.inheritance.child;

import basics.hari.oops.inheritance.Parent;

public class Child extends Parent {
	

	@Override
	public void sayHello(){
		super.sayHello();
		System.out.println("Hello from Child");
		
		
	}
	
	
	public void sayGoodMorning() throws Exception{
		System.out.println("Good morning");
		throw new Exception("test");
	}
	
	/*
	public  void sayFinalHello(){
		System.out.println("hello finally, no overriding here");
	}
	
	*/

}
