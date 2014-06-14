package in.careerscale.batch4.office.spring.impl;

import org.springframework.stereotype.Component;

import in.careerscale.batch4.office.spring.HelloWorld;

@Component("telugu")
public class TeluguHelloWorld implements HelloWorld {

	public void sayHello() {
		
		System.out.println("Namasthe");

	}

}
