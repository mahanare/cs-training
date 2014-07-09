package in.careerscale.training.hari.inner;

//This is typical class defined in another .Java file, generated output will be very same as if it is in 
//its own file. i.e; MyAnotherClass.java
class MyAnotherClass{
	
}

public class StaticInnerClass {
	
	private static String name="Harinath";
	
	private String nonStaticName="Swetha";
	public void sayHello(){
		System.out.println("Hello");
	}
	
	static class MyStaticClass{
		
		///private String name;
		
		public void sayHello(){
			System.out.println("hello from static inner class MyStaticClass " + name  );
			//nonStaticName="test";
		}
	}

	public void setName(String name){
		this.name = name;
	}
	public static void main(String[] args) {
		
		//outer class works like a package
		
		//in.careerscale.training.hari.inner.StaticInnerClass.MyStaticClass demo = new in.careerscale.training.hari.inner.StaticInnerClass.MyStaticClass();
		StaticInnerClass.MyStaticClass demo = new StaticInnerClass.MyStaticClass();
		
		demo.sayHello();
		
		
		
		StaticInnerClass outerClass = new StaticInnerClass();
		outerClass.setName("Nisha");
		
		demo.sayHello();
	}

}
