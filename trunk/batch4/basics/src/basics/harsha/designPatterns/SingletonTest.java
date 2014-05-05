package basics.harsha.designPatterns;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	// is there a way to test a class which uses Singleton DP
	@Test
	public void testSingleton() {
		SingletonExample s = SingletonExample.getInstance();
		assertEquals(s, s);
	}

}
