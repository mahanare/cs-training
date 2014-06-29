package in.careerscale.training.hari.oops;

public class Parent {
	
	public void sayHello(){
		System.out.println("Hello");
	}
	
	
	protected String getLastName(){
		System.out.println(this.getFirstName());
		return "lastName";
	}
	
	
	private String getFirstName(){
		return "firstName";
	}
	
	String getMiddleName(){
		return "middleName";
	}
	
	
}
