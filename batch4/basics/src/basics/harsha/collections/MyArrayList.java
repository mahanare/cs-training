package basics.harsha.collections;

public class MyArrayList<T> {
	
	 int capacity = 5;
	T[] myArray;
	int index=0;
	
	public MyArrayList()
	{
		myArray = (T[]) new Object[capacity];
	}
	
	public void add(T element)
	{
		
		if(index<capacity-1)
		{
			myArray[index] = element;
			index++;	
		}
		else
		{
			increaseArrayCapacityandAddElement(element);
		}
		
	}


	private void increaseArrayCapacityandAddElement(T element) {
		T[] temp = (T[]) new Object[capacity];
		for(int i=0;i<index;i++)
		{
			temp[i] = myArray[i];
		}
		capacity = capacity * 2;
		myArray = (T[]) new Object[capacity];
		
		for(int i=0;i<index;i++)
		{
			myArray[i] = temp[i];
		}
		System.out.println("Capacity doubled");
		add(element);
		
	}
	
	
	public String toString()
	{
		String result = "";
		for(int i=0;i<index;i++)
		{
			T str = myArray[i];
			result = result + str + ' ';
		}
		return result;
	}
	
	public int size()
	{
		return index;
	}
	
}
