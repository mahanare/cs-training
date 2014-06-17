package in.careerscale.batch4.office.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("application")
public class Application {
	
	@Autowired
	@Qualifier("telugu")
	private HelloWorld world;
	
	
	public void sayHello(){
		world.sayHello();
	}

}
