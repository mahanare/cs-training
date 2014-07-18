package in.careerscale.training.hari.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import in.careerscale.training.hari.io.Coffee;
import in.careerscale.training.hari.io.Mocha;

public class ReflectionDemo {

	public void displayObjectProperties(Object mocha) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		
		Class classObject = mocha.getClass();
		
		Method[] methods = classObject.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getModifiers() + " " + method.getName());
			if(method.getName().equals("getDescription")){
				System.out.println(method.invoke(mocha, null));
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		ReflectionDemo demo = new ReflectionDemo();
		demo.displayObjectProperties(new Mocha(new Coffee()) );

	}

}
