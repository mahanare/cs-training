package basics.hari.oops.inheritance;

/**
 * final class is always final and you can not have sub classses. "final" enforces this logic (of having no child/sub classes).
 * This is kind of opposite to "abstract" key word where inheritance is mandatory.
 * @author harinath
 *
 */
public final class FinalClassDemo {
		
	private final int number;// =100;
	FinalClassDemo(){
		number =100;
	}
	public void sayHello(){
		System.out.println("Hello");

	}
}
