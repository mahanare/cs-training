package basics.nitya.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class CollectionsDemo {

	
	public void arrayDemo(){
		
		int chocolates[]=new int[4];
		
		chocolates[0]=2;
		chocolates[1]=3;
		chocolates[2]=4;
		chocolates[3]=5;
		
		System.out.println(chocolates.length);
		
		for(Object achoc : chocolates){
			
			System.out.println("The array of chocolates are"+achoc);					
		}
			
		}
	
	public void listDemo(){
		
		List chocolates = new ArrayList();
		
		chocolates.add(3);
		chocolates.add(4);
		chocolates.add(5);
		chocolates.add(6);
		chocolates.add(7);
		chocolates.add(8);
		
		for(Object choc : chocolates){
			
			System.out.println("number of chocolates are"+choc);					
		}
		List<Integer> myChocolates = new ArrayList<Integer>();
		
		myChocolates.addAll(myChocolates);
		//Class classObject =myChocolates.getClass();
		
		Iterator ir = myChocolates.iterator();
		
		while(ir.hasNext()){
			System.out.println(ir.next());
			//myChocolates.remove(4);
			//ir.remove();
			System.out.println("number of chocolates removed"+myChocolates);		
		}
				
	}	
	
public static void main(String[] args) {
		
		
		CollectionsDemo demo = new CollectionsDemo();
			
		demo.listDemo();
		
		List<String> myList = new ArrayList<String>();
	
}
	}
