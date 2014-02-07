package in.careerscale.training.simple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * for AOP sample, please read http://www.mkyong.com/spring/spring-aop-examples-advice/
 * @author harinath
 *
 */
public class ApplicationTest {
	
	private ApplicationContext  context;
	
	@Before
	public void setup(){
		context = new ClassPathXmlApplicationContext("spring-config.xml");
	}
	
	
	@Test
	public void test() {
		  
		
		Application application = (Application) context.getBean("application");
		application.startApplication();
				
	}
	
	@Test
	public void testBeanWithConstructor(){

			BeanWithConstructor myBean = (BeanWithConstructor) context.getBean("myBean");
			myBean.displayData();
	}

}
