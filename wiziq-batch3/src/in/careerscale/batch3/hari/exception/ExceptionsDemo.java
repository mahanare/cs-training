package in.careerscale.batch3.hari.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo {

	public void demoSampleException() {

		int i = 100;
		int j = 0;

		System.out.println(i / j);
		System.out.println("after i/j"); // this line never gets executed

	}
	
	public void demoCheckedException(){
		//new FileInputStream("sample.dat");
		try {
			FileInputStream stream = new FileInputStream("sample.dat");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void demoCheckedException(boolean throwException) throws MyCheckedException{
		if(throwException){
			throw new MyCheckedException("dummy checked exception");
		}
	}
	
	public void demoUncheckedException(boolean throwException){
		if(throwException){
			throw new MyUncheckedException("dummy UNCHECKED exception");
		}
	}

	public static void main(String[] args) {

		ExceptionsDemo demo = new ExceptionsDemo();
		try {
			demo.demoSampleException();
			System.out.println("This will never be printing");
			//
			//
			//
		}
		 catch (ArithmeticException e) {
				System.err.println(e.getMessage());
			}
		catch(Exception exception){
			exception.printStackTrace();
		} 
		finally{
			System.out.println("This gets executed whether there is an exception or not.");
		}
		
		System.out.println("After demoSampleException() call");
		
		try {
			demo.demoCheckedException(true);
		} catch (MyCheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		demo.demoUncheckedException(true);

	}

}
