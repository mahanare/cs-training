package basics.hari.innerclasses;

public interface MyOuterInterface {

	public void sayHello();

	public class MyInnerClass {
		public void sayHello() {
			System.out.println("Hello from MyInnerClass");
		}
	}

}
