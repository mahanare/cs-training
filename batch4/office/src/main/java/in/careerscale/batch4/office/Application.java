package in.careerscale.batch4.office;

import in.careerscale.batch4.office.impl.SimpleHelloWorld;

public class Application {
	
	private HelloWorld world;
	
	public Application() {
		world = new SimpleHelloWorld();
	}
	
	public void sayHello(){
		world.sayHello();
	}

}
