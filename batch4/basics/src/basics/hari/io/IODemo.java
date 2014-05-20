package basics.hari.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.next());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(reader.readLine());
		
		System.err.println(reader.readLine());
		
		

	}

}
