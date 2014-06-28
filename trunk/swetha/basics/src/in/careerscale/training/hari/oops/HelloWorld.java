package in.careerscale.training.hari.oops;

public class HelloWorld {
	
	public HelloWorld(String name){
		System.out.println("Within constructor");
	}
	
	public HelloWorld(int id){
		System.out.println("Within constructor");
	}
	
	public HelloWorld(String name,String age){
		System.out.println("Within constructor with 2 parameters");
	}
	
	public void sayHello(){
		String message = sayHi() +"Hello World";
		System.out.println(message);
		printNumbers();
	}
	
	
	public void sayHello(String name){
		System.out.println("Hello " + name);
		printNumbers();
	}
	
	private String sayHi(){
		return "Hi";
	}
	
	
	public void sayHello(String name,Integer something){
		System.out.println("Hello " + name);
	
	}
	
	public Integer hello(){
		return 2;
	}
	
	private void printNumbers(){
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
	}

}
