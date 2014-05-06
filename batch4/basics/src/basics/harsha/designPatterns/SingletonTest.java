package basics.harsha.designPatterns;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	// is there a way to test a class which uses Singleton DP
	@Test
	public void testSingleton() {
		SingletonExample s = SingletonExample.getInstance();
		SingletonExample s1 = SingletonExample.getInstance();
		SingletonExample s2 = SingletonExample.getInstance();
		
		assertEquals(s, s1);
		assertEquals(s1, s2);
		assertEquals(s, s2);
	}

}
