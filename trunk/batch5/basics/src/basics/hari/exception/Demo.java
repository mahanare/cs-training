package basics.hari.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {

	public void demoForCheckedException() throws FileNotFoundException {

		try {
			FileInputStream file = new FileInputStream("Test");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
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
		} catch (Exception ae) {
			System.out.println("Within AE block");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}

	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.demoForUncheckedException();
	}

}
