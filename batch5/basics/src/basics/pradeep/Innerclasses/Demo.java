package basics.pradeep.Innerclasses;

import basics.hari.innerclasses.MyOuterInterface.MyInnerClass;
import basics.pradeep.HelloWorld;
import basics.pradeep.Innerclasses.MyOuterClass.MyOuterInnerClass;

public class Demo {
	public void demoAnonymousInnerclass() {
		HelloWorld world = new HelloWorld() {
			public void sayHello() {
				System.out.println("Hello from the anonymous class");
			}

		};
		world = new HelloWorld() {
			public void sayHello() {
				System.out.println("Hello from the anonymous class");
			}

		};
		world.sayHello();
	}

	public static void main(String[] args) {
		MyInnerClass myInnerObject = new MyInnerClass();
		myInnerObject.sayHello();
		MyOuterClass myOuterObject = new MyOuterClass();
		MyOuterInnerClass myOuterInnerObject = myOuterObject.new MyOuterInnerClass();
		myOuterInnerObject.sayHi();

		MyOuterClassForStaticInner inner = new MyOuterClassForStaticInner();
		inner.sayHello();

	}
}
