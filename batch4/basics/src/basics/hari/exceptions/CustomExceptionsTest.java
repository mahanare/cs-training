package basics.hari.exceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomExceptionsTest {

	
	@Test
	public void testCheckedException() {
		
		MyCheckedException checkedException = new MyCheckedException("standard message", "custom message", 100);
		
		try {
			throw checkedException;
		} catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test(expected=MyRuntimeException.class)
	public void testUncheckedException(){
		throw new MyRuntimeException("runtime exception", "custom runtime msg", 500);
	}
	
	@Test
	public void testCustomError(){
		try{
		throw new CustomError("testing for error demo");
		}catch(Throwable error){
			error.printStackTrace();
		}
	}

}
