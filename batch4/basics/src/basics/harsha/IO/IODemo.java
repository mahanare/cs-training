package basics.harsha.IO;

import java.io.*;

public class IODemo extends Thread {

	public String readUsingBufferedReader() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String message = br.readLine();
		br.close();
		return message;
		

	}
	
	public void readUsingBufferedReaderFromFiles() throws IOException,FileNotFoundException
	{
		String file = "file.txt";
		FileInputStream fio =new FileInputStream(file);
		InputStreamReader ir = new InputStreamReader(fio);
		BufferedReader br = new BufferedReader(ir);
		String line="";
		while(line.isEmpty())
		{
			line = br.readLine();
			System.out.println(line);
		}
	}
	
	
	public void charArrayReader() throws IOException
	{
		char[] ch = {'a','z','c','d','e','f','g','h'};
		CharArrayReader cr = new CharArrayReader(ch);
		while(cr.ready())
		{
			System.out.println(cr.read());
		}
	}
	
	public void pipedReader() throws IOException
	{
		Reader input = new PipedReader();

		int data = input.read();
		while(data != -1) {
		  data = input.read();
		  System.out.println(data);
		}
		input.close();
		
	}
}
