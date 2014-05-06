package basics.nitya.inheritance;

public abstract class AbstractHelloWorld {

	private int number;
	protected String name="hello welcome";

	public AbstractHelloWorld(){
	this.name="welcome here";
	this.number=007;
	System.out.println("Default constructor with out paramaters");
		}
	public AbstractHelloWorld(String name,int number){
		this();
		System.out.println("paramaters:"+ name);
		
		this.name=name;
		this.number= number;
		System.out.println(" constructor with  paramaters");
	}
	public void sayHello(){
		System.out.println("Hello World");
	}
	
	public void sayHello(String name){
		System.out.println("Hello World");
	}
	
	public void sayHi(int number){
		System.out.println(007);
	}

	abstract public void sayHi(String name);
}

		
	
