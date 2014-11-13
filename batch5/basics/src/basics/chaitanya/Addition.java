package basics.chaitanya;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		float A, B, C;
		System.out.println("Enter A,B value:");
		Scanner in = new Scanner(System.in);
		A = in.nextFloat();
		B = in.nextFloat();
		C = A + B;
		System.out.println("Sum 'C':" + C);
		in.close();
	}

	public void sayHello() {
		int i = 10;
		if (i == 10) {
			System.out.println("i " + i);
		}
	}
}
