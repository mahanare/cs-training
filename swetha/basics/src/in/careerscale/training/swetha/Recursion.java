package in.careerscale.training.swetha;

class Factorial {

	int fact(int n) {
		int result;
		if (n == 1)
			return (1);

		result = fact(n - 1) * n;
		return result;

	}
}

public class Recursion {
	public static void main(String args[]) {
		int a = 10;
		Factorial obj = new Factorial();
		System.out.println("Factorial of the number is" + obj.fact(a));
	}
}