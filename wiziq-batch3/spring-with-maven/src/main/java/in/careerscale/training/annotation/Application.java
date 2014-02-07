package in.careerscale.training.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Repository
//@Service
//@Controller

@Component
public class Application {
	
	@Autowired
	@Qualifier("world")
	private HelloWorld world;
	@Value("hari")
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
	}

}
