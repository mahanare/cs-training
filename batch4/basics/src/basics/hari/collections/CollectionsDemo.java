package basics.hari.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class CollectionsDemo {
	
	
	public void arrayDemo(){
		
		String[] names = new String[5];
		
		int numbers[] = new int[5];
		
		numbers[0]=100;
		numbers[1]=23;
		numbers[2]=40;
		numbers[3]=40;
		numbers[4]=40;
		
		
		System.out.println(numbers.length);
		
		for (int number : numbers) {
			
			if(number ==23){
				System.out.println("number 23 is found");
			}
			System.out.println("number is " + number);
		}
		
		numbers[5]=200;
		
		
	}


	private void listDemo() {
		
		List numbers = new ArrayList();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(10);
		numbers.add(20);
	
		numbers.add(80);
		
		numbers.add("hari");
		
		numbers.add(5, 2000);
		
		for (Object object : numbers) {
			System.out.println("the object value is :" + object);
		}
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		numbers.addAll(myNumbers);
		Class classObject =numbers.getClass();
		
		Iterator ir = numbers.iterator();
		
		while(ir.hasNext()){
			System.out.println(ir.next());
			//numbers.remove(4);
			//ir.remove();
		}
		
		
		//myNumbers.add("Hari");
		//Generics

		
		
	}

	
	public static void main(String[] args) {
		
		
		CollectionsDemo demo = new CollectionsDemo();
		//demo.arrayDemo();
		
		demo.listDemo();
		
		List<String> myList = new ArrayList<String>();
		
		Set<String> mySet = new HashSet<String>();
		
		
	}
}
