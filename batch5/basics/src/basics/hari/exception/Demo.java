package basics.hari.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {

	public void demoForCheckedException() throws Exception {

		try {
			FileInputStream file = new FileInputStream("Test");
			System.out.println("This may never get executed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new Exception("File not found: demo program for exceptions",
					e);
		}

		finally {
			System.out.println("This gets executed always");
		}

	}

	public void demoForUncheckedException() {

		try {
			System.out.println("demo");
			System.out.println(100 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Within AE block");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception b) {
			System.out.println("Within AE block");
			b.printStackTrace();
			System.out.println(b.getMessage());
		} finally {
			System.out.println("This gets executed always");
		}

	}

	public void demoCustomCheckedException() throws MyCheckedException {
		System.out.println("within custom checked exception");
		throw new MyCheckedException("this is just dummy", null);
	}

	public void demoCustomRuntmeException() {
		System.out.println("within custom runtime exception");
		throw new MyUnCheckedException("this never gets error by compiler");
	}

	public static void main(String[] args) throws Exception {

		Demo demo = new Demo();
		// demo.demoForUncheckedException();
		// demo.demoForCheckedException();

		// demo.demoCustomRuntmeException();

		demo.demoCustomCheckedException();

	}

}
