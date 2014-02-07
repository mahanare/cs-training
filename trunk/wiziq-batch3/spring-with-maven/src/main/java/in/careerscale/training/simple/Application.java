package in.careerscale.training.simple;

public class Application {
	
	private HelloWorld world;
	private String name;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setWorld(HelloWorld world) {
		this.world = world;
	}
	
	public void startApplication(){
	//	world = new HelloWorldImpl();
		this.world.sayHello();
		System.out.println("injected name property value from application.properties is : " + name);
	}

}
