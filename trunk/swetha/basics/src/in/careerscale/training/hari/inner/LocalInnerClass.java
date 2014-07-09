package in.careerscale.training.hari.inner;

import java.util.ArrayList;

public class LocalInnerClass {
	
	private String name="Ambika";
	
	public void sayHello(){
		System.out.println("Hello from LocalInnerClass.sayHello()");
		
		class LocalClass {
			public  String localName ="Hari";
			public void sayHelloFromInner(){
				System.out.println("Hello from sayHelloFromInner.sayHelloFromInner()" + name);
				localName="test";
				name="swetha";
			}
		}
		
		LocalClass local = new LocalClass();
		local.sayHelloFromInner();
		System.out.println(local.localName);
		
		ArrayList list;
		
		
		
	}
	
	public void sayHi(){
		//local inner classes are very much local to the area where it is defined.
		//LocalClass local = new LocalClass();
		//local.sayHelloFromInner();
		
		class LocalClass {
			public  String localName ="Hari";
			public void sayHelloFromInner(){
				System.out.println("Hello from sayHelloFromInner.sayHelloFromInner()" + name);
				localName="test";
				name="swetha";
			}
		}
		
		LocalClass local = new LocalClass();
		local.sayHelloFromInner();
	}
	
	public static void main(String[] args) {
		
		LocalInnerClass local = new LocalInnerClass();
		local.sayHello();
	}

}
