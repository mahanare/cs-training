package basics.harsha.reflections;

import java.lang.reflect.*;

/**
 * @author harsha
 *
 */
public class ReflectionsApiDemo {
	
	private int number = 100;

	private String sayHello()
	{
		return "Hello";
	}
	
	private String sayGoodMorning()
	{
		return "Good Morning";
	}
	
	private int add(int n1, int n2)
	{
		int result= n1+ n2;
		return result;
	}
	

	public static void main(String[] args) {
		
		Class<ReflectionsApiDemo> reflectClass = ReflectionsApiDemo.class;
		Method[] methods = reflectClass.getDeclaredMethods();
		
		for(Method m : methods)  //prints out the methods of this class
		System.out.println(m);
		
		String className = reflectClass.getName();  //prints out the name of this class
		System.out.println(className);
		
		int modifier = reflectClass.getModifiers();
		
		System.out.println(Modifier.isPublic(modifier));  //checks to see if the modifier is public or not
		
		
		

	}

}
