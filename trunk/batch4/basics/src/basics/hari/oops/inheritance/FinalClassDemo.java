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
	
	FinalClassDemo(int number){
		this();
		String name="hari";
		sayHello(name);
	}
	public void sayHello(final String name){
		System.out.println("Hello, " + name);
		//name="harsha";

	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}
