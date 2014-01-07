package in.careerscale.batch3.hari.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {
	
	private String[] nameArray;
	private int[]   numbers;
	private float  floatNumbers[];
	
	
	private List<String> names;
	private List<Integer> numbersList;
	
	private Set<String>  uniqueNames;
	
	
	
	/**
	 * 1. Arrays store only homogeneous data(same type of data).
	 * 2. Arrays have fixed size and need to be initialized
	 */
	public void arraysDemo(){
		nameArray = new String[10];
		//nameArray[0]= 1000;
		
		nameArray[0]="this is the first string";
		
		nameArray[8]="this is the 8th string";
		

		
		System.out.println(nameArray[0]);		
		System.out.println(nameArray[8]);
		
		nameArray[10] = "This will through exception";		
	}
	
	
	public void listDemo(){
		names = new ArrayList<String>();
		names.add("hari");
		names.add("Praveen");
		
		System.out.println(names.size());
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		//to print all of them, you can write for loop.
		
		names.add("hari");
		names.add("panchanan");
		names.add("abc");
		
		
		 java.util.Collections.sort(names);
		
		System.out.println(names);
		
		
	}
	
	public void setDemo(){
		Set<String> namesSet = new HashSet<String>();
		
		namesSet.add("hari");
		namesSet.add("hari");
		namesSet.add("praveen");
		namesSet.add("Nirali");
		namesSet.add("Nalini");
		namesSet.add("vikram");
		namesSet.add("praveen");
		namesSet.add("praveen");
		namesSet.add("praveen");
		
		System.out.println(namesSet.size());
		
		System.out.println(namesSet);
		
	}
	
	
	public void iteratorDemo(){
		
	Set<String> namesSet = new HashSet<String>();
		
		namesSet.add("hari");
		namesSet.add("hari");
		namesSet.add("praveen");
		namesSet.add("Nirali");
		namesSet.add("Nalini");
		namesSet.add("vikram");
		namesSet.add("praveen");
		namesSet.add("praveen");
		namesSet.add("praveen");
		
		System.out.println(namesSet.size());
		
		Iterator<String> ir = namesSet.iterator();
		
		while(ir.hasNext()){
			String name = ir.next();
			System.out.println(name);
			
			name = ir.next();
		}
		
	}
	
	public void mapDemo(){
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("hari", "blue");
		map.put("praveen", "green");
		map.put("vikram", "white");
		
		System.out.println(map.get("vikram"));
		
		Set<Entry<String, String>> entrySet  = map.entrySet();
		
		Iterator<Entry<String,String>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()){
			
			Entry entry = entryIterator.next();
			System.out.println(entry.getKey() +"  :  " + entry.getValue());
		}
		
		Set<String> keySet = map.keySet();
		Collection<String> collection =map.values();
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Collections demo = new Collections();
		//demo.listDemo();
		//demo.setDemo();
		demo.mapDemo();
	}

}
