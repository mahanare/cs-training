package basics.hari.oops;

public class StaticDemo {
	
	int id;
	
	static String name="hari";
	
	static void sayHello(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		StaticDemo demo1 = new StaticDemo();
		demo1.id=10;
		
		StaticDemo demo2 = new StaticDemo();
		demo2.id=20;
		
		StaticDemo.name="Hari";
		
		System.out.println("demo1.id="  + demo1.id);
		System.out.println("demo2.id="  + demo2.id);
		
		System.out.println("Static name value : " +StaticDemo.name);
		
		StaticDemo.sayHello();
		
		//demo1.sayHello();
		
		
		
		
		
		
	}

}
