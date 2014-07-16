package in.careerscale.training.swetha.collections;

import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyCollections {

	public void studentNames() {

		Set set1 = new HashSet();
		set1.add("swetha");
		set1.add("geetha");
		set1.add("nitha");

		System.out.println(set1);
		set1.remove("geetha");
		System.out.println(set1);
		
		Iterator ir=set1.iterator();
		
		if(ir.hasNext()){
			System.out.println(set1);
		}
			
	}
	
	public void studentMarks(){
		
		Map map1=new HashMap();
		map1.put("swetha",20);
		map1.put("geetha", 15);
		
		
		System.out.println(map1.get("swetha"));
		System.out.println(map1.get("geetha"));
		//can we use the iterator for map???
		
		
	}
	
	public void studentAppereadOnExam(){
		List<String> list1 = new ArrayList<String>();
		
		list1.add("swetha");
		list1.add("geetha");
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));

		
	}

	public static void main(String[] args) {

		MyCollections demo = new MyCollections();
		demo.studentNames();
		demo.studentAppereadOnExam();
		demo.studentMarks();
	}
}
