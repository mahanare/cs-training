package basics.hari.oops.inheritance.demo;

import basics.hari.oops.inheritance.Parent;
import basics.hari.oops.inheritance.child.Child;

public class Application {

	public static void main(String[] args) {
		
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

}
