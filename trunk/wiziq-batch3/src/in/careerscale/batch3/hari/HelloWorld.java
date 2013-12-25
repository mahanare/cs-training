package in.careerscale.batch3.hari;

/**
 * 
 * @author harinath 
 * skype:mahanare
 * email: harinath@careerscale.in
 * website : http://careerscale.in
 *
 */

/**
 * 
 * class name should always start with a upper case letter and if it is a multi word string, every word should start with
 * upper case letter as well.
 *
 */
public class HelloWorld {
	
	private String name;
	
	public HelloWorld(){
		System.out.println("Constructor with no arguments");
	}
	
	public HelloWorld(String name){
		System.out.println("Constructor with parameter name");
		this.name=name;
	}
	
	public void sayHello(){
		System.out.println("Hello World " + name);
	}

	public static void main(String[] args) {
		//int size=10;
		HelloWorld hariWorld = new HelloWorld();
		hariWorld.sayHello();
		
		HelloWorld brunoWorld = new HelloWorld("Bruno");
		brunoWorld.sayHello();
		
		HelloWorld asraWorld = new HelloWorld("Asra");
		asraWorld.sayHello();
		
	}

}
