package basics.hari.unit;

public class HelloWorld {
	
	public String sayHello(){
		System.out.println("Hello this is test for reflections API");
		return "Hello";
	}
	public void sayHi(String... name){
		
		System.out.println(name[0]);
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class classObject =Class.forName("basics.hari.unit.HelloWorld");

		HelloWorld world = new HelloWorld();
		world.sayHi("Hari","Harsha","Nitya");
	}

}
