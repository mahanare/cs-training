package in.careerscale.batch3.hari.oops.polymorphism;

public class Demo {

	public static void main(String[] args) {
		
		//java Demo
		//Demo.main(params)
		Parent parent = new Parent();
		parent.sayHello(1);
		parent.sayHello("Vamsi");
		parent.sayHello("hari", 34);
		
		Child child = new Child();
		

		child.sayHello(2);
		child.sayHello("hari");
		child.sayHello("abc", 12);
		
		
		Child child1 = new Child();

	}

}
