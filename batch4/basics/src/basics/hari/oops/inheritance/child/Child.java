package basics.hari.oops.inheritance.child;

import basics.hari.oops.inheritance.Parent;

public class Child extends Parent implements Runnable {
	

	@Override
	public void sayHello(){
		super.sayHello();
		System.out.println("Hello from Child");
		
		
	}
	
	
	public void sayGoodMorning() throws Exception{
		System.out.println("Good morning");
		throw new Exception("test");
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	public  void sayFinalHello(){
		System.out.println("hello finally, no overriding here");
	}
	
	*/

	
	public static void main(String[] args) {
		Child child = new Child();
		Thread myThread = new Thread(child);
		myThread.start();
	}
}
