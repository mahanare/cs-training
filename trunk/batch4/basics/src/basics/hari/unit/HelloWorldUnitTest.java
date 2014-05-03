package basics.hari.unit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldUnitTest {

	
	@Test
	public void test() {
		
		HelloWorld world = new HelloWorld();
		String  message = world.sayHello();
		assertEquals("Hello", message);
		
	}

}
