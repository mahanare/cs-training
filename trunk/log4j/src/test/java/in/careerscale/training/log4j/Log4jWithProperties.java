package in.careerscale.training.log4j;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class Log4jWithProperties {

	//@Test
	public void simpleLoggingWithFileAndProperties() {
		// DOMConfigurator.configure(Loader.getResource("log4j.xml"));
		
		// use the next line only when the log4j.properties is in the path for application.
		//PropertyConfigurator.configure("custom_log4j.properties");
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("custom_log4j.properties");
		PropertyConfigurator.configure(url);
		
		
		Logger log = LogManager.getRootLogger();
		log.info("Hello this is info");
		log.warn("Hello this is warn");
		log.error("Hello this is error");
		log.fatal("Hello this is fatal");

		Logger appLog = Logger.getLogger("application");

		appLog.info("Hello this is info to application log");
		appLog.warn("Hello this is warn to application log");
		appLog.error("Hello this is error to application log");
		appLog.fatal("Hello this is fatal to application log");
	}
	
	
	@Test
	public void simpleLoggingWithPropertyLoading() throws IOException
	{
		
		Properties props = new Properties();
		props.load(getClass().getResourceAsStream("/custom_log4j.properties"));
		PropertyConfigurator.configure(props);
		
		Logger appLog = Logger.getLogger(Log4jWithProperties.class);

		appLog.info("Hello this is info to application log");
		appLog.warn("Hello this is warn to application log");
		appLog.error("Hello this is error to application log");
		appLog.fatal("Hello this is fatal to application log");
		
	}

}
