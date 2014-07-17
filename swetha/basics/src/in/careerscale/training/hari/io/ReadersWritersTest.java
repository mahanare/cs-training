package in.careerscale.training.hari.io;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class ReadersWritersTest {

	@Test
	public void readerWriterTest() throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("bufferedReaderWriter.data"));
		
		String inputLine;
		
		do{
			
			inputLine = bufferedReader.readLine();
			if(inputLine!=null){
				bufferedWriter.write(inputLine+"\n");
				bufferedWriter.flush();
			}
			
			
		}
		while(inputLine !=null);
		
	
		bufferedReader.close();
		bufferedWriter.close();
		
	}
	

}
