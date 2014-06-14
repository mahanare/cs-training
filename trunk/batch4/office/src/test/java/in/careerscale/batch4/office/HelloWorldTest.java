package in.careerscale.batch4.office;

import in.careerscale.batch4.office.impl.SimpleHelloWorld;
import in.careerscale.batch4.office.impl.TeluguHelloWorld;

import org.junit.Test;

public  class HelloWorldTest {
	
	private HelloWorld world;
	
	@Test
	public void testHello_simpleWorld(){
		
		world = new SimpleHelloWorld();
		world.sayHello();
	}
	
	@Test
	public void testHello_teluguWorld(){
		world = new TeluguHelloWorld();
		world.sayHello();
	}

}
