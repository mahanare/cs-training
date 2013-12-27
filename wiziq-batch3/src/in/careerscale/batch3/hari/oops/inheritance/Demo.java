package in.careerscale.batch3.hari.oops.inheritance;

import in.careerscale.batch3.hari.oops.inheritance.HariWorld;

public class Demo {

	public static void main(String[] args) {
		
		Parent parent = new Parent("Hari");
		parent.sayGoodMorning();
		parent.sayHello();
		//parent.revealSecret();
		parent.familySecret();

		parent.sayGoodEvening();
		
		Child child = new Child("Abhi");
		
		child.sayGoodMorning();
		child.sayHello();
		child.saySomething();
		child.familySecret();
		
		//AbstractParent absParent = new AbstractParent();
		AbstractParent absParent = new ChildForAbstractParent();
		absParent.sayHello();
		
		HelloWorld helloWorld = new HariWorld();
		helloWorld.sayHello();
		HelloNewYear newYear = new HariWorld();
		newYear.sayHappyNewYear();
		
		((HariWorld)newYear).sayHello();
		
		

	}

}
