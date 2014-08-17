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
		
		
		Logger log = LogManager.getRootLogger();
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
