package basics.hari.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

public class Demo {

	private void stringBufferStream() throws IOException {
		InputStream input = System.in;

		// System.out.println(input.read());

		input = new StringBufferInputStream(
				"sdfsdfdsfsdfdsfds sdfsdfsdfds sdfdsf aa");

		while (input.available() > 0) {
			System.out.print((char) input.read());
		}
	}

	private void fileOutputStreamDemo() throws IOException {

		FileOutputStream out = new FileOutputStream("demo.txt");
		out.write("demo text".getBytes());
	}

	private void filInputStreamDemo() throws IOException {
		FileInputStream input = null;
		try {
			input = new FileInputStream("demo.txt");
			while (input.available() > 0) {
				System.out.print((char) input.read());
			}
		} finally {
			input.close();
		}

	}

	private void bufferedReaderDemo() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = br.readLine();
		System.out.println(message);

	}

	public static void main(String[] args) throws IOException {

		Demo demo = new Demo();
		// demo.fileOutputStreamDemo();
		// demo.filInputStreamDemo();

		demo.bufferedReaderDemo();
	}

}
