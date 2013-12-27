package in.careerscale.batch3.hari.oops.inheritance;

import in.careerscale.batch3.hari.oops.inheritance.HelloNewYear;
import in.careerscale.batch3.hari.oops.inheritance.HelloWorld;

public class HariWorld implements HelloNewYear, HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("hello");

	}

	@Override
	public void sayHappyNewYear() {
		
		System.out.println("Happy new year");

	}

}
