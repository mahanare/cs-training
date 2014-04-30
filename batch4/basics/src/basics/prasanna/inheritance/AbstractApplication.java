package basics.prasanna.inheritance;

public class AbstractApplication extends AbstractParent {

	@Override
	public void sayHi(String name) {
		super.sayHello();
		System.out.println("Hi, I am "+ name);
	}

	public static void main(String[] args) {
		AbstractApplication abs = new AbstractApplication();
		abs.sayHi("Dhanush");
		
	

	}

}
