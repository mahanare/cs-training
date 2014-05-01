package basics.hari.oops.inheritance.demo;

import basics.hari.oops.inheritance.AbsHelloWorld;
import basics.hari.oops.inheritance.HelloWorld;
import basics.hari.oops.inheritance.Parent;
import basics.hari.oops.inheritance.child.Child;
import basics.hari.oops.inheritance.child.HelloWorldImpl;

public class Application {
	
	public void basicInheritanceDemo(){
		Child child = new Child();
		child.sayHello("hari");
		child.sayHello();
		child.sayGoodMorning();
		
		
		((Parent)child).sayHello();
		
		Parent p =  child;
		
		p.sayHello();
	
		
		
		Parent p1 = new Child();
		
		p1.sayHello();
	}
	
	
	public void inheritanceDemo(){
		//AbsHelloWorld hello = new HelloWorldImpl();
		
		AbsHelloWorld helloWithParams = new HelloWorldImpl(10,"Hari");
	
	
	}

	public static void main(String[] args) {
		

	  Application app = new Application();
	  app.inheritanceDemo();
		
		
		//AbsHelloWorld world = new AbsHelloWorld();
		

	}

}
