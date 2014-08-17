package in.careerscale.training.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;
/**
 * 
 * Copyright (C) [2012] - [2014] CareerScale IT Consulting LLP. All rights reserved.
 * 
 * If you got benefit with this code or with our training modules or for business queries, please do send email to info@careerscale.in
 * 
 * Information is provided in AS IS condition.
 * 
 */

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;

public class Log4jXmlTest  extends BaseLogTest{

	@Test
	public void test() {
		DOMConfigurator.configure(Loader.getResource("custom_log4j.xml"));
		
		Logger log = LogManager.getRootLogger();
		logPanagramResults(log);

		Logger appLog = Logger.getLogger("application");
		logPanagramResults(appLog);
	}

}
