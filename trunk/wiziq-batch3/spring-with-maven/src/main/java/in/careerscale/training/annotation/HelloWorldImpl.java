package in.careerscale.training.annotation;


import org.springframework.stereotype.Component;

@Component("world")
public class HelloWorldImpl implements HelloWorld {

	
	@Override
	public void sayHello() {
		
		System.out.println("Hello World");

	}

}
