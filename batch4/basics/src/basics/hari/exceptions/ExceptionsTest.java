package basics.hari.exceptions;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * 
 * @author harinath
 * 
 */
public class ExceptionsTest {

	@Test
	public void test() {

		try {
			FileInputStream fio = new FileInputStream("test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			int result = 100 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void exceptionsDemo_CheckedException() {

		// throw
		// throws
		// catch
		// try
		// finally

		try {
			System.out.println("This is before exception");
			if (true) {
				throw new Exception("this is sample exception");
			}
			System.out
					.println("This is after exception and this never gets executed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("This gets executed irrespective of the fact that exception happens or not");
		}

	}
	
	@Test
	public void exceptionsDemo_CheckedExceptionWithThrows() throws Exception {

		// throw
		// throws
		// catch
		// try
		// finally

	
			System.out.println("This is before exception");
			if (true) {
				throw new Exception("this is sample exception");
			}
			System.out
					.println("This is after exception and this never gets executed");
		

	}


	@Test
	public void exceptionsDemo_UnCheckedException() {

		// throw
		// throws
		// catch
		// try
		// finally

		System.out.println("This is before exception");

		throw new RuntimeException("this is sample exception");
		// System.out.println("This is after exception and this never gets executed");

	}

}
