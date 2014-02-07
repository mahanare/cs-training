package in.careerscale.training.annotation;

import in.careerscale.training.annotation.AppStarter.Config;

import javax.annotation.Nonnull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * for AOP sample, please read http://www.mkyong.com/spring/spring-aop-examples-advice/
 * @author harinath
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class,loader=AnnotationConfigContextLoader.class)
@Nonnull
public class AppTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

	
	@Autowired
	private Application application;
	
	
	@Test
	public void test() {
		  
		
		//Application application = (Application) context.getBean("application");
		application.startApplication();
		
		
		
		
	}
	

}
