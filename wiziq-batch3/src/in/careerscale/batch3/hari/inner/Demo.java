package in.careerscale.batch3.hari.inner;

public class Demo {
	HelloWorld world;
	static class MyStaticClass {

		public MyStaticClass() {

		}

		public void sayHello() {
			System.out.println("Hello from MyStaticClass");
		}
	}

	class MyInnerClass {

		public MyInnerClass() {

		}

		public void sayHello() {
			System.out.println("Hello from MyInnerClass");
			
			
		}
	}
	
	public void demoLocalInnerClass(){
		final String name = "Hari";
		
		class LocalInnerClass{
			
			public void sayHello(){
				System.out.println("Hello from demoLocalInnerClass" + name);
			}
		}
		
		LocalInnerClass localInner = new LocalInnerClass();
		localInner.sayHello();
		
		//world.sayHello();
	}
	
	
	public void demoAnonymousClass(){
		
		 world = new HelloWorld() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello from HelloWorld (anonymous inner class");
				
			}
		};
		
		 world = new HelloWorld() {
				
				@Override
				public void sayHello() {
					System.out.println("Hello from HelloWorld (anonymous inner class");
					
				}
			};
		
		world.sayHello();
	}

	public static void main(String[] args) {

		Demo demo = new Demo();

		MyInnerClass myInner = demo.new MyInnerClass();

		MyStaticClass myStatic = new MyStaticClass();
		
	}

}
