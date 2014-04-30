package basics.hari.oops.inheritance;

public abstract class AbsHelloWorld {
	
	public void sayHello(){
		System.out.println("Hello World");
	}
	
	public void sayHello(String name){
		System.out.println("Hello World");
	}

	abstract public void sayHi (String name);
}
