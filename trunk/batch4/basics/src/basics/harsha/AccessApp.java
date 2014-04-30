package basics.harsha;

import basics.harsha.AccessDemo;
import basics.hari.oops.HelloWorld;

public class AccessApp {

	public static void main(String[] args) {
		
		HelloWorld world = new HelloWorld();
		System.out.println(world.sayHello("Hari"));

		HelloWorld world1 = new HelloWorld();
		System.out.println(world1.sayHello("prasanna"));
		
		HelloWorld world2 = new HelloWorld();
		System.out.println(world2.sayHello("Harsha"));
		
		HelloWorld world3 = new HelloWorld();
		System.out.println(world3.sayHello("Nitya"));
		
		
		AccessDemo demo = new AccessDemo();
		demo.name="hari";
		demo.city="Hyderabad";
		

	}

}
