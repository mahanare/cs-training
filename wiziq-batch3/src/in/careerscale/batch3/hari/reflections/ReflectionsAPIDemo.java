package in.careerscale.batch3.hari.reflections;

import in.careerscale.batch3.hari.collections.Collections;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ReflectionsAPIDemo {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {

		ReflectionsAPIDemo demo = new ReflectionsAPIDemo();
		demo.reflectionsDemo(demo);
	
		Collections collections = new Collections();
		
		demo.reflectionsDemo(collections);
		

	}
	
	
	
	public void reflectionsDemo(Object object) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
		
		@SuppressWarnings("rawtypes")
		Class classObject = object.getClass();
		System.out.println(classObject.getName());
		
		Constructor[] constructors =classObject.getConstructors();
		Object obj1 = constructors[0].newInstance(new Object[]{});
		
		
		Method[] methods =classObject.getMethods();
		for (int i = 0; i < methods.length; i++) {			
			System.out.println("Methods available are :: " + methods[i].getName());
			if(methods[i].getName().contains("String")){
				System.out.println("Regular toSTring output ::" + object.toString());
				System.out.println("Invoking toString explicitly  :: "+methods[i].invoke(object, new Object[]{} ));
			}
		}
		
	}

}
