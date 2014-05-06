package basics.nitya.inheritance;

public class Parent {
	
	public void sayHello(){
		System.out.println("hello from Parent class");
	}
	
	public void sayHello(String name){
		System.out.println("hello from parent"+name);
		}
	
	public void sayHi(int number){
		System.out.println("hello from parent"+number);
	}

	public final void SayFinalHello(){
		System.out.println("hello from finally of parent,no overriding");
	}		
		
}
