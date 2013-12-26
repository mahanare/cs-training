package in.careerscale.batch3.hari.oops;

public class Parent {
	
	private String name;
	//private, protected, public 
	
	protected int age;
	
	public Parent(){
		System.out.println("Inside Parent constructor with no arguments");
	}
	
	public Parent(String name){
		this();
		System.out.println("Inside Parent Constructor with name as parameter");
		this.name=name;
	}
	
	private String parentSecret(){
		return "secret";
	}
	
	public void revealSecret(){
		parentSecret();
	}
	
	public void sayHello(){
		System.out.println("Hello " + name);
		//sayGoodEvening();
	}
	
	public void sayGoodMorning(){
		System.out.println("Good morning  " + name);
	}
	
	protected void familySecret(){
		System.out.println("This is  a family secret");
	}
	
	/**
	 * Default access specifier. it just means we do not specify any access specifier.
	 * It is accessible from the same class and also from the same package classes.
	 */
	void sayGoodEvening(){
		System.out.println("Good evening");
	}

}
