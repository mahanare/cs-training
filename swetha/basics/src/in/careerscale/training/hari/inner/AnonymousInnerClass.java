package in.careerscale.training.hari.inner;

public class AnonymousInnerClass {
	
	private String name ="Pratima";
	
	public void sayHello(){
		
		System.out.println("Within sayHello");
		
		
		//SomeClass implements HelloWorld{
		
		//write implementation for interface methods.
		
	    //}
		
		//HelloWorld helloWorld = new SomeClass();
		
		
		HelloWorld world = new HelloWorld() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				
			}
		};
		
		HelloWorld helloWorld = new HelloWorld() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello world from anonymous class" + name);
				
			}
		};
		
		helloWorld.sayHello();
		
		
	}
	
	public static void main(String[] args) {
		
		AnonymousInnerClass demo = new AnonymousInnerClass();
		demo.sayHello();
	}

}
