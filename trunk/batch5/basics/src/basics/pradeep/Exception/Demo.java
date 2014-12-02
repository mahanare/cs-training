package basics.pradeep.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
	public void demoForCheckedException() throws FileNotFoundException {

		try {
			FileInputStream file = new FileInputStream("Check it");
		} catch (FileNotFoundException f) {
			// TODO Auto-generated catch block
			f.fillInStackTrace();
			throw f;
		}

	}

	public void demoForUncheckedException() {

		try {
			System.out.println("message");
			System.out.println(100 / 0);
		} catch (ArithmeticException a) {
			System.out.println("Within AE block");
			a.printStackTrace();
			System.out.println(a.getMessage());
		} catch (Exception b) {
			System.out.println("Within AE block");
			b.printStackTrace();
			System.out.println(b.getMessage());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
