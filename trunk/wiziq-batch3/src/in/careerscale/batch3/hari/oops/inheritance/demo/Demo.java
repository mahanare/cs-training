package in.careerscale.batch3.hari.oops.inheritance.demo;

import in.careerscale.batch3.hari.oops.inheritance.Child;
import in.careerscale.batch3.hari.oops.inheritance.Parent;
//java.lang
public class Demo {

	public static void main(String[] args) {
		
		Parent parent = new Parent("Hari");
		parent.sayGoodMorning();
		parent.sayHello();
        parent.notify();
		//parent.revealSecret();
		//parent.familySecret();
		//parent.sayGoodEvening();
		
		Child child = new Child("Abhi");
		
		child.sayGoodMorning();
		child.sayHello();
		child.saySomething();
		//child.familySecret();

	}

}