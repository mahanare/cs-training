/**
 * 
 * Copyright (C) [2012] - [2014] CareerScale IT Consulting LLP. All rights reserved.
 * 
 * If you got benefit with this code or with our training modules or for business queries, please do send email to info@careerscale.in
 * 
 * Information is provided in AS IS condition.
 * 
 */
package in.careerscale.training.log4j;

import in.careerscale.training.PanagramChecker;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class Log44WithPropertiesTest extends BaseLogTest {

	@Test
	public void simpleLoggingWithFileAndProperties() {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("custom_log4j.properties");
		PropertyConfigurator.configure(url);
		Exception e=null;
		
		Logger log = LogManager.getRootLogger();
		//Multiple ways of getting logger root/by name/package/class
		Logger loggerByName = LogManager.getLogger("application");
		Logger loggerByPackageName = LogManager.getLogger("in.careerscale");
		Logger loggerByClassName = Logger.getLogger(PanagramChecker.class);
		log.info("info message");
		log.warn("warn message");
		log.error("error occurred", e);
		
		
		loggerByClassName.info("test");
		loggerByName.info("test");
		loggerByPackageName.info("test");
		
		logPanagramResults(log);

		Logger appLog = Logger.getLogger("application");
		logPanagramResults(appLog);

	}
	
	
	@Test
	public void simpleLoggingWithPropertyLoading() throws IOException
	{
		
		Properties props = new Properties();
		props.load(getClass().getResourceAsStream("/custom_log4j.properties"));
		PropertyConfigurator.configure(props);
		
		Logger appLog = Logger.getLogger(Log44WithPropertiesTest.class);
		logPanagramResults(appLog);
		
	}


}
