package in.careerscale.training.hari.oops;

public class OopsDemo {

	public static void main(String[] args) {

		HelloWorld hello = new HelloWorld("Hi");

		hello = new HelloWorld("Hari", "age");

		int count = 5;
		count = 10;

		Child child = new Child();

		Parent p = new Child();

		p.sayHello();
		p.getLastName(); // accessible protected method in the same package.
		p.getMiddleName();

		((Child) p).sayChildHello();

		// java.lang.Object;

	}

}
