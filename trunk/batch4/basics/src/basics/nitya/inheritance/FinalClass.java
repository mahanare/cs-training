package basics.nitya.inheritance;

public class FinalClass {
	
	private final int number;
	
	FinalClass(){
		number =100;
	}
	
	FinalClass(int number){
		this();
		String name="Nitya";
		sayHello(name);
	
	}
	
	public void sayHello(final String name){
		System.out.println("Hello, " + name);
		
	}
	
	
}
