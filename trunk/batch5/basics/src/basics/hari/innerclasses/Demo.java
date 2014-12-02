package basics.hari.innerclasses;

import basics.hari.innerclasses.MyOuterClass.MyOuterInnerClass;
import basics.hari.innerclasses.MyOuterInterface.MyInnerClass;

public class Demo {

	public static void main(String[] args) {
		// MyOuterInterface myInf = new MyOuterImplementation();
		MyInnerClass myInnerObject = new MyInnerClass();
		myInnerObject.sayHello();
		MyOuterClass myOuterObject = new MyOuterClass();
		MyOuterInnerClass myOuterInnerObject = myOuterObject.new MyOuterInnerClass();
		myOuterInnerObject.sayHi();
	}

}
