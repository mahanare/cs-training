package in.careerscale.training.hari.collections;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
		List<String> myList = new ArrayList<String>();
		myList.add("test1");
		myList.add("test");
		myList.add("test");
		myList.add("test2");
		myList.add("test3");
		myList.add("test");
		myList.add("test5");
		
		myList.add("test");
		
		System.out.println(myList.size());
		
		System.out.println(myList);
		
		System.out.println(myList.get(2));
		
		myList.remove(1);
		
		System.out.println(myList);
	}
	
	
	public void mapDemo(){
		Map map = new HashMap();
		map.put("hari", 1000);
		map.put("hari1", 1000);
		map.put("hari2", 1000);
		
		System.out.println(map.get("hari"));
		
		
	}
	

	public static void main(String[] args) {
		
		String[] names = new String[100];
		
		CollectionsDemo demo = new CollectionsDemo();
		demo.setDemo();
		
		demo.listDemo();
		demo.mapDemo();
		
		

	}

}
