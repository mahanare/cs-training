package basics.hari.innerclasses;

import basics.hari.innerclasses.MyOuterClass.MyOuterInnerClass;
import basics.hari.innerclasses.MyOuterClassForStaticInner.MyStaticInner;
import basics.hari.innerclasses.MyOuterInterface.MyInnerClass;

public class Demo {

	public void demoAnonymousInnerClass() {

		HelloWorld world = new HelloWorld() {

			public void sayHello() {
				System.out.println("hello from anonymous class");

			}
		};

		world = new HelloWorld() {

			public void sayHello() {
				System.out.println("hello from anonymous class");

			}
		};

		world.sayHello();
	}

	public static void main(String[] args) {
		// MyOuterInterface myInf = new MyOuterImplementation();
		MyInnerClass myInnerObject = new MyInnerClass();
		myInnerObject.sayHello();
		MyOuterClass myOuterObject = new MyOuterClass();
		MyOuterInnerClass myOuterInnerObject = myOuterObject.new MyOuterInnerClass();
		myOuterInnerObject.sayHi();

		MyStaticInner inner = new MyStaticInner();
		inner.sayHello();

	}

}
