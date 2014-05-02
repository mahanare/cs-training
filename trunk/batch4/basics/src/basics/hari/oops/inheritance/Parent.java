package basics.hari.oops.inheritance;

public class Parent {
	
	public void sayHello(){
		System.out.println("Hello from parent");
	}
	
	public void sayHello(String name){
		System.out.println("Hello from parent, " +name);
	}
	
	public final void sayFinalHello(){
		System.out.println("hello finally, no overriding here");
	}

}
