package in.careerscale.batch4.office.spring.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.careerscale.batch4.office.spring.HelloWorld;

@Component("simple")
public class SimpleHelloWorld implements HelloWorld{

	
	public void sayHello() {
		
		System.out.println("Hello World");
		
	}

}
