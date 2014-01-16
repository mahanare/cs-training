package in.careerscale.batch3.hari.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamsAndReaders {

	public void readStream() throws IOException {

		InputStream inStream = System.in;

		System.out.println("type a single character");
		int intValue = inStream.read();
		System.out.println("The entered byte value is :" +(char) intValue);

	}

	public void inputReaderDemo() throws IOException {
		System.out.println("\n\n Reader demo ");
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] inputArray = new char[10];
		System.out.println("Enter some characters");
		reader.read(inputArray);
		System.out.println("You have entered :" + new String(inputArray));

	}

	public void bufferedReaderDemo() throws IOException {
		System.out.println("\n\nBuffered reader demo");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("You entered : " + input);

	}
	
	
	public void dataInputStreamDemo() throws IOException{
		
		DataInputStream in = new DataInputStream(System.in);
		char charData =in.readChar();
		//in.readInt();
		int number = in.readInt();
		 
		System.out.println("char data ::" + charData  + "  :: number  " + number);
		
	}
	
	
	public void fileReadingemo() throws IOException{
		
		FileInputStream fio = new FileInputStream("test.dat");
		
		InputStreamReader ir = new InputStreamReader(fio);
		BufferedReader br = new BufferedReader(ir);
		String line =null;
		boolean eof = false;
		while(!eof){
			line =br.readLine();
			if(line == null)
				eof =true;
			else
				System.out.println(line);
		
		}
				
		br.close();
		ir.close();
		fio.close();
	 
	}
	
	
	public void fileWritingDemo() throws IOException{
		
		//FileOutputStream fio = new  FileOutputStream("test.dat");
		
		
		FileWriter writer = new FileWriter("C:\\Users\\harinath\\Desktop\\test.dat");
		BufferedWriter bw = new BufferedWriter(writer);
		
		
		//BufferedWriter(new FileWrtier(new FileOutputStream))
		
		bw.write("This is first line\n");
		bw.write("This is second line\n");
		bw.write("This is third line\n");
		bw.close();
		writer.close();
		
	}
	

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		StreamsAndReaders reader = new StreamsAndReaders();
		
//	reader.dataInputStreamDemo();
   reader.readStream();
	//	reader.inputReaderDemo();
	//	reader.bufferedReaderDemo();

	//	reader.fileWritingDemo();
	//	reader.fileReadingemo();
		
	}

}
