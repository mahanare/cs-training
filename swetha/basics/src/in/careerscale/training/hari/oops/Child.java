package in.careerscale.training.hari.oops;

public class Child extends Parent {
	
	private int id;
	private String name;
	
	
	public Child(){
		super();
		
		System.out.println("Child constructor");
		
	}
	
	
	public Child(String name){
		this();
		this.name=name;
	}
	
	public Child(String name, int id){
		this(name);
		this.id=id;
	}
	
	public void sayHello(String name){
		System.out.println("Hello " +name);
		this.name=name;
	
	}
	
	public void sayChildHello(){
		System.out.println("Hello from Child class");
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		this.sayChildHello();
		super.getLastName();
		this.id=100;
		System.out.println("Example of overriding in child class for the method defined in Parent");
	}

}
