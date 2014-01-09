package in.careerscale.batch3.hari.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
	

		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		
		System.gc();
		
		List myList = new ArrayList();
		
	
		
		//Singleton object = new Singleton();

	}

}
