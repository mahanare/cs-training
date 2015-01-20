package basics.hari.spring;

public class HelloWorldImpl2 implements HelloWorld {

	public String sayHello() {
		World world = new World();
		return "Hello" + "  " + world.getWorld();
	}

}
