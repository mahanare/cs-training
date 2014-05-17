package basics.harsha.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collections {
	public static void main(String args[])
	{
		setRetainAllExample();
		System.out.println("==============================");
	//	listRetainAllExample();
		System.out.println("==============================");
		listIteratorExample();
	}

	public static void setRetainAllExample()
	{
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println(set1);
		set2.add(1);
		set2.add(2);
		set2.add(6);
		
		set1.retainAll(set2);  //it gives the intersection of the two sets and stores it in set1
		
		System.out.println(set1); 
	}
	
	public static void listRetainAllExample()
	{
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list2.add(1);
		list2.add(2);
		list2.add(6);
		
		list1.retainAll(list2);  
		//it chooses an element from first list and checks to see if the second list has the element. If it does, the first list retains it.
		
		System.out.println(list1); 
	}
	
	public static void listIteratorExample()
	{
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		Iterator ir = list1.iterator();
		System.out.println(list1);
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
			list1.remove(4); //throws concurrent modification exception
		}
		
		System.out.println(list1);
	}
	
}
