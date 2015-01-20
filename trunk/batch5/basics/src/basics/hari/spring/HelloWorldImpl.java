package basics.hari.spring;

public class HelloWorldImpl implements HelloWorld {

	public String sayHello() {
		World world = new World();
		return "Hello" + "  " + world.getWorld();
	}

}
