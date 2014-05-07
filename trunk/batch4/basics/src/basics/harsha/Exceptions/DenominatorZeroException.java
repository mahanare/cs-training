package basics.harsha.Exceptions;

public class DenominatorZeroException extends Exception {

	public DenominatorZeroException(double number) {

		if (number == 0) {

			System.out.println("Denominator cannot be equal to 0");
		}

	}

}
