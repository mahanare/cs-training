package in.careerscale.batch4.office.spring;

import in.careerscale.batch4.office.spring.Application;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringApplicationTest {
	
	@Test
	public void sayHello(){
		ApplicationContext context = 
		          new AnnotationConfigApplicationContext(SpringApplicationTest.class);
		Application app = context.getBean(Application.class);
		app.sayHello();
	}
}
