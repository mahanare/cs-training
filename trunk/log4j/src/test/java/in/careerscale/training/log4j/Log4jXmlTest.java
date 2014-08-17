package in.careerscale.training.log4j;

import static org.junit.Assert.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;

public class Log4jXmlTest {

	@Test
	public void test() {
		DOMConfigurator.configure(Loader.getResource("custom_log4j.xml"));
		
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

}
