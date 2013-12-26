package in.careerscale.batch3.hari.oops;

public class Child extends Parent {
	
	public Child(String name){
		super(name);
		System.out.println("Inside Child constructor");
	}
	
	public void saySomething(){
		System.out.println("Something something");
		sayHello();
	}

}
