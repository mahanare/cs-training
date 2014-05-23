package basics.harsha.IO;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class IODemoTest {

	@Test
	public void testReadUsingBufferedReader() throws IOException {
		IODemo io = new IODemo();
		String str = io.readUsingBufferedReader();
		assertEquals("the message is" , "Hello", str);
	}

	@Test
	public void testReadUsingBufferedReaderFromFiles() throws FileNotFoundException, IOException {
		IODemo io = new IODemo();
		io.readUsingBufferedReaderFromFiles();
	}
	
	@Test
	public void testCharArrayReader() throws FileNotFoundException, IOException {
		IODemo io = new IODemo();
		io.charArrayReader();
	}
	
	public void testPipedReader() throws FileNotFoundException, IOException {
		IODemo io = new IODemo();
		io.pipedReader();
	}
	
	
	

}
