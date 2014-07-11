package in.careerscale.training.hari.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {
	
	public void setDemo(){
		
		Set mySet = new HashSet();
		mySet.add("hari");
		mySet.add(new Integer(100));
		mySet.add("hari");
		mySet.add(new Integer(100));
		mySet.add("hari");
		mySet.add(new Integer(100));
		mySet.add("hari");
		mySet.add(new Integer(100));
		mySet.add("hari");
		mySet.add(new Integer(100));
		mySet.add("hari");
		mySet.add(new Integer(100));
		mySet.add("hari1");
		mySet.add(new Integer(1001));
		
		//mySet.remove("hari");
		System.out.println(mySet.size());
		
		System.out.println(mySet);
		
		Iterator ir =mySet.iterator();
		
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		
		
	}
	
	public void listDemo(){
		List myList = new ArrayList();
		myList.add("test");
		myList.add("test");
		myList.add("test");
		myList.add("test");
		myList.add("test");
		
		myList.add("test");
		
		System.out.println(myList.size());
		
		System.out.println(myList);
		
		
	}

	public static void main(String[] args) {
		
		String[] names = new String[100];
		
		CollectionsDemo demo = new CollectionsDemo();
		//setDemo.setDemo();
		
		demo.listDemo();
		

	}

}
