package in.careerscale.training.hari.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine());
		
		InputStreamReader reader = new InputStreamReader(System.in);
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(scanner.next());

	}

}
