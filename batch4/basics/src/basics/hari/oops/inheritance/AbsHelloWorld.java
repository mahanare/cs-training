package basics.hari.oops.inheritance;

public abstract class AbsHelloWorld {
	
	private int number;
	protected String name="nothing";
	
	public  AbsHelloWorld(){
		this.name="No one";
		this.number=0;
		System.out.println("Default constructor without parameters for AbsHelloWorld");
	}
	
	public AbsHelloWorld(String name, int number){
		this();
		
		System.out.println("this is to check the parameter value : " + name);
		
		this.name =name;
		this.number= number;
		System.out.println("constructor with parameters for AbsHelloWorld");
	}
	
	public void sayHello(){
		System.out.println("Hello World");
	}
	
	public void sayHello(String name){
		System.out.println("Hello World");
	}

	abstract public void sayHi (String name);
}
