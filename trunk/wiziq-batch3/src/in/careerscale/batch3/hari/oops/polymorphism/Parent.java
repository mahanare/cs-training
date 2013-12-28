package in.careerscale.batch3.hari.oops.polymorphism;

/**
 * overloading :
 *  Method name will remain same.
 *  number arguments
 *  type of arguments
 *  
 *  What doesn't participate:
 *  return type, access specifier
 *  
 *  
 *  
 * @author harinath
 *
 */
public class Parent {

	public void sayHello(String name){
		System.out.println("Hello " +name);
	}
	
	 
	public void sayHello(String name, int age){
		System.out.println("Hello " + name + " and your age is " + age);
	}
	
	public void sayHello(int id){
		System.out.println("Hello Mr/Mrs with id " + id);
	}
}
