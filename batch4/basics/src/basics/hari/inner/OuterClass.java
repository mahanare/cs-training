package basics.hari.inner;

/**
 * Important aspects of inner classes. 1. How do we write inner classes 2. How
 * do we create Objects 3. Scoping of variables (out class variables
 * accessibility inside inner class etc) 4. Scoping of inner classes (where it
 * is visible etc. ex: local inner class life is within the containing method
 * and not at all visible outside.
 * 
 * @author harinath
 * 
 */

// Outer class
public class OuterClass {

	private int outerId = 100;

	class InnerClass {
		private int innerId = 200;

		public void sayInnerHello() {
			System.out.println("Hello from InnerClass");
			System.out.println(outerId);
		}
	}

	public void sayHello() {
		System.out.println("Hello from InnerClassDemo");
		// System.out.println(innerId);
	}

	public static class StaticInnerClass {
		public void sayHelloFromStaticInner() {
			System.out.println("Hello from  StaticInnerClass");
		}
	}

	public void localInnerClassDemoMethod() {
		final int localInnerMethodId = 300;

		class LocalInnerClass {
			public void sayLocalHello() {
				System.out.println("Hello from Local Inner class"
						+ localInnerMethodId); // only final variables of
												// containing method are
												// accessible in local inner
												// class.
			}
		}

		LocalInnerClass localObject = new LocalInnerClass();
		localObject.sayLocalHello();
	}

	public void anonymousInnerClassDemo() {

		HelloWorld world = new HelloWorld() {

			@Override
			public void sayHello() {
				System.out.println("Hello from Anonymous inner class");

			}
		};

		world.sayHello();
		
		world = new HelloWorld() {

			@Override
			public void sayHello() {
				System.out.println("Hello from Anonymous inner class 2");

			}
		};
		
		world.sayHello();
		

	}

	public static void main(String[] args) {

		OuterClass demo = new OuterClass();
		demo.sayHello();

		InnerClass innerObject = demo.new InnerClass();
		innerObject.sayInnerHello();

		StaticInnerClass staticObject = new StaticInnerClass();

	}

}
