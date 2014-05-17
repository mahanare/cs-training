package basics.hari.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import basics.hari.unit.HelloWorld;

public class ReflectionAPIDemo {

	
	public void ObjectIntraspection(Object myObject) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
	

		Class unknownClass = myObject.getClass();
		
		System.out.println(unknownClass.getCanonicalName());
		
		Method[]  methods = unknownClass.getMethods();
		
		
	
		
		for (Method method : methods) {
			
			System.out.println(method.getName());
			System.out.println(method.getModifiers());
			if(method.getName().equals("sayHello")){
				method.invoke(myObject, (Object[]) null);
			}
			
			if(method.getName().equals("sayHi")){
				//method.invoke(myObject, (Object[])new String[] {"Nitya","Harsha","Hari"});
			}
	        
		}
		
		Constructor[] constructors = unknownClass.getConstructors();
		
		//constructors[0].newInstance(paramArrayOfObject)
		
		
	}
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		HelloWorld hello = new HelloWorld();
		
		ReflectionAPIDemo demo = new ReflectionAPIDemo();
		
		demo.ObjectIntraspection(hello);

	}

}
