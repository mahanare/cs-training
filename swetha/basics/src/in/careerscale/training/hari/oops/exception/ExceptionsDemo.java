package in.careerscale.training.hari.oops.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo {

	public void errorDemo() {

		try {
			throw new CustomError("Hi this is custom error");
		} catch (Throwable error) {
			System.err.println(error.getMessage());
			// error.printStackTrace();
		}
	}

	public void checkedExceptionDemo() {

		try {
			FileInputStream fileInput = new FileInputStream("input.txt");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void checkedExceptionDemoThrow() throws FileNotFoundException {

		FileInputStream fileInput = new FileInputStream("input.txt");

	}

	public void checkedExceptionDemoForThrow() throws FileNotFoundException {
		checkedExceptionDemoThrow();
	}

	public void divideByZeroDemo() {

		System.out.println(10 / 0);
	}

	public void runtimeDemo() {
		throw new CustomRuntimeException(
				"this is just a dummy runtme exception");
	}

	public static void main(String[] args) {

		ExceptionsDemo demo = new ExceptionsDemo();

		try {
			demo.runtimeDemo();
		} catch (Throwable e) {
			System.out.println(e.getMessage());

		}
		demo.errorDemo();
		System.out.println("After handlign error");
		try {
			demo.checkedExceptionDemoThrow();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			System.out.println("this gets executed all the time");
		}
		System.out.println("Ater trying the throw logic");
		// demo.divideByZeroDemo();

	}

}
