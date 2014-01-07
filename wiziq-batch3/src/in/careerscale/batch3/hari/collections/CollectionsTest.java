package in.careerscale.batch3.hari.collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionsTest {

	Collections collections = new Collections();
	
	//@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArrayDemo() {
		collections.arraysDemo();
	}
	
	//@Test
	public void testListDemo(){
		collections.listDemo();
	}

	
	//@Test
	public void testSetDemo(){
		collections.setDemo();
	}
	
	//@Test
	public void testIteratorDemo(){
		collections.iteratorDemo();
	}
	
	
	@Test
	public void testMapDemo(){
		collections.mapDemo();
	}
}
