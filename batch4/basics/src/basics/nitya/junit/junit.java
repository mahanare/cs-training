package basics.nitya.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit {

	@Test
	public void test() {
		
		HelloWorldUnitTest hell=new HelloWorldUnitTest();
		String mess=hell.sayHello();
		assertEquals("hello nitya",mess);

	}

}





