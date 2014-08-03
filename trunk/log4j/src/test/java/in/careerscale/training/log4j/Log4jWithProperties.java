package in.careerscale.training.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.Test;

public class Log4jWithProperties {


  @Test
  public void simpleLoggingWithStandardOutput() {
    // DOMConfigurator.configure(Loader.getResource("log4j.properties"));
    // PropertyConfigurator.configure("log4j.properties");
   // PropertyConfigurator.configure("simple_log4j.properties");
    Configurator.initialize("console", "log4j2/xml/log4j2.xml");
    Logger log = LogManager.getRootLogger();
    log.info("Hello this is info");
    log.warn("Hello this is warn");
    log.error("Hello this is error");
    log.fatal("Hello this is fatal");
  }



}
