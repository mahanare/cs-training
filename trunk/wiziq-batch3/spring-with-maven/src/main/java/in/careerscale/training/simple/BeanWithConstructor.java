package in.careerscale.training.simple;

public class BeanWithConstructor {
	
	private String name;
	private int id;
	
	private HelloWorld world;
	
	public  BeanWithConstructor(String name, int id, HelloWorld helloWorld){
		this.name=name;
		this.id=id;
		this.world = helloWorld;
	}
	
	public void displayData(){
		System.out.println("Hello Mr. " + name + " with your id " + id);
	}

}
