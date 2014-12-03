package basics.hari.innerclasses;

public class MyOuterClass {

	public void sayHello() {
		System.out.println("Hello from MyOuterClass");

	}

	class MyOuterInnerClass {
		public void sayHi() {
			System.out.println("Hi from MyOUterInnerClass");
		}
	}

	public void demoLocalInnerClass() {

		class MyLocalClass {
			public void sayHello() {
				System.out.println("Hello from local class");
			}
		}

		MyLocalClass myLocal = new MyLocalClass();
		myLocal.sayHello();

	}

}
