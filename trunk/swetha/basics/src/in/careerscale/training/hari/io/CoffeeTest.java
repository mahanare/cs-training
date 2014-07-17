package in.careerscale.training.hari.io;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.junit.Before;
import org.junit.Test;

public class CoffeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCoffeeWithMilk() {
		
		Beverage beverage = new Coffee();
		
		Beverage coffeeWithMilk = new Milk(beverage);
		
		System.out.println(coffeeWithMilk.getDescription());
		System.out.println(coffeeWithMilk.getCost());
		
		assertEquals("Basic Coffee with Milk", coffeeWithMilk.getDescription());
		assertEquals(10, coffeeWithMilk.getCost());
		
		Beverage coffeeWithMilkAndMocha = new Mocha(coffeeWithMilk);
		
		System.out.println(coffeeWithMilkAndMocha.getDescription());
		System.out.println(coffeeWithMilkAndMocha.getCost());
		
		assertEquals("Basic Coffee with Milk with Mocha", coffeeWithMilk.getDescription());
		assertEquals(15, coffeeWithMilk.getCost());
		
		
	}
	
	@Test
	public void testInputStream(){
		
		InputStream input;
		OutputStream output;
		InputStreamReader reader;
		OutputStreamWriter writer;
	}

}
