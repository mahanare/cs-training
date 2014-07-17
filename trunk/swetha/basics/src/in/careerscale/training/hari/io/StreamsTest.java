package in.careerscale.training.hari.io;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Test;

public class StreamsTest {

	// @Test
	public void testIOStreams() {

		InputStream stream = System.in;
		OutputStream out;

		try {
			out = new FileOutputStream("test.data");
			int data = -1;
			while (data != 48) {
				data = stream.read();
				// System.out.println(data);
				out.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testFilterStreams() throws IOException {
		BufferedInputStream bufferedInput = new BufferedInputStream(System.in);
		BufferedOutputStream bufferedOut = new BufferedOutputStream(
				new FileOutputStream("buffered.data"));
		int in;
		/**
		 * do { in = bufferedInput.read(); if (in != -1) System.out.print(" " +
		 * in); } while (in != -1); bufferedInput.close();
		 */

		byte[] data = new byte[124];

		do {
			in = bufferedInput.read(data);
			bufferedOut.write(data);
		} while (in != -1);
		bufferedInput.close();
		bufferedOut.close();
	}

	@Test
	public void testObjectStreams() throws FileNotFoundException, IOException {

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("object.data"));
		Beverage drink = new Mocha(new Milk(new Coffee()));
		objectOutputStream.writeObject(drink);
		objectOutputStream.close();

	}

	@Test
	public void testReadObjectFromFileWithStream()
			throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream("object.data"));

		Object object = objectInputStream.readObject();
		Beverage drink = (Beverage) object;
		System.out.println(drink.getDescription());
		System.out.println(drink.getCost());
		System.out.println(((Mocha) drink).getSomeText());
		objectInputStream.close();

	}

}
