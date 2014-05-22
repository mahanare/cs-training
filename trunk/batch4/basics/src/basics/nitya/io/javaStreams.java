package basics.nitya.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class javaStreams {
	
	public void readStream() throws IOException{
		
		InputStream inStream=System.in;		
		System.out.println("enter a character");
		int Val=inStream.read();
		System.out.println("entered character is:"+ (char) Val);
	}
	
	public void inputReaderDemo() throws IOException{
		
		InputStreamReader reader = new InputStreamReader(System.in);
		char[] charInputArray = new char[10];
		System.out.println("enter few chars");
		reader.read(charInputArray);
		System.out.println("You have entered :" + new String(charInputArray));
				
	}
		
	public void bufferReaderDemo() throws IOException{
		
		System.out.println("\n\nBuffered reader demo:enter few chars");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in =br.readLine();
		System.out.println("You entered : " + in);
	}
	
	public void dataInputstreamDemo() throws IOException{
		
		System.out.println("enter char and number");
		DataInputStream input = new DataInputStream(System.in);
		char inputData=input.readChar();
		int number= input.readInt();
		System.out.println("You entered the chars::" + inputData +"::number"+number);	
	}
	
	public void FileReadingDemo()throws IOException{
		
		FileInputStream fs = new FileInputStream("test.dat");
		InputStreamReader ir=new InputStreamReader(fs);
		BufferedReader br= new BufferedReader(ir);
		String lines=null;
		boolean eof = false;
		while(!eof){
			lines=br.readLine();
			if(lines==null){
				eof=true;}
			else{
				System.out.println(lines);
			}
			br.close();
			ir.close();
			fs.close();
			}		
		}
	
	public void fileWritingDemo() throws IOException{
		FileWriter fw = new FileWriter("D:\test.dat");
		BufferedWriter bwr = new BufferedWriter(fw);
		bwr.write("This is first line of file\n");
		bwr.write("This is second line of file\n");
		bwr.write("This is third line of file\n");
		bwr.close();
		fw.close();
			
		}
public static void main(String[] args) throws IOException {
	javaStreams js = new javaStreams();
	//js.readStream();
	//js.bufferReaderDemo();
	//js.FileReadingDemo();
	//js.fileWritingDemo();
	//js.inputReaderDemo();
	js.dataInputstreamDemo();
	
	//Scanner sc=new Scanner(System.in);
	//System.out.println(sc.nextLine());
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	
}
}
