package basics.harsha.collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		MyArrayList<Integer>  demoArray= new MyArrayList<Integer>();
		demoArray.add(5);
		demoArray.add(4);
		demoArray.add(7);
		demoArray.add(6);
		demoArray.add(8);
		demoArray.add(9);
		demoArray.add(5);
		demoArray.add(4);
		demoArray.add(7);
		demoArray.add(6);


		System.out.println(demoArray);
		System.out.println("The size is "+ demoArray.size());
		
		
	}

}
