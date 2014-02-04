package in.careerscale.training.annotation;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Nonnull
public class AppStarter {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(AppStarter.class);

	public static void main(String[] args) {
		LOGGER.info("Starting up...");
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				Config.class)) {
			//LOGGER.info(context.getBean(App.class).getMessage());
		}
	}

	@Configuration
	@ComponentScan(basePackages = { "in.careerscale.training.annotation" })
	@ImportResource(value = "classpath:aop.xml")
	public static class Config {
		
		@Bean
		public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
			PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
			ppc.setSystemPropertiesMode(org.springframework.beans.factory.config.PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_OVERRIDE);
			ppc.setSearchSystemEnvironment(true);
			 Resource[] resources = new ClassPathResource[ ]
					   {new ClassPathResource( "application.properties" ) };
			  ppc.setLocations( resources );
					  ppc.setIgnoreUnresolvablePlaceholders( true );
			
			return ppc;
		}
		
		
	}
}
