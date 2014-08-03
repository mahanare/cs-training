package in.careerscale.training.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class Log4jWithProperties {


  @Test
  public void simpleLoggingWithStandardOutput() {
    // DOMConfigurator.configure(Loader.getResource("log4j.properties"));
    // PropertyConfigurator.configure("log4j.properties");
    PropertyConfigurator.configure("simple_log4j.properties");

    Logger log = Logger.getRootLogger();
    log.info("Hello this is info");
    log.warn("Hello this is warn");
    log.error("Hello this is error");
    log.fatal("Hello this is fatal");
  }



}
