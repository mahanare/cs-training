package in.careerscale.training.log4j2;

import org.apache.logging.log4j.Logger;

import in.careerscale.training.PanagramChecker;
import in.careerscale.training.PanagramConstants;


public class BaseLogTest {
	
	protected void logPanagramResults(Logger log){
		log.debug("Panagram check for "+ PanagramConstants.ANTIQUE_IVORY + "  -> "  + PanagramChecker.isPangram(PanagramConstants.ANTIQUE_IVORY));
		log.debug("Panagram check for "+ PanagramConstants.BIG_FUZI + "  -> "  + PanagramChecker.isPangram(PanagramConstants.BIG_FUZI));
		log.info("Panagram check for "+ PanagramConstants.BLOCK_FOX + "  -> "  + PanagramChecker.isPangram(PanagramConstants.BLOCK_FOX));
		log.info("Panagram check for "+ PanagramConstants.BLOWZY_NIGHT + "  -> "  + PanagramChecker.isPangram(PanagramConstants.BLOWZY_NIGHT));
		log.warn("Panagram check for "+ PanagramConstants.BRIGHT_PAINT + "  -> "  + PanagramChecker.isPangram(PanagramConstants.BRIGHT_PAINT));
		log.warn("Panagram check for "+ PanagramConstants.FIVE_LIZARDS + "  -> "  + PanagramChecker.isPangram(PanagramConstants.FIVE_LIZARDS));
		log.warn("Panagram check for "+ PanagramConstants.JULY_SUN + "  -> "  + PanagramChecker.isPangram(PanagramConstants.JULY_SUN));
		log.error("Panagram check for "+ PanagramConstants.JUTE_BAGS + "  -> "  + PanagramChecker.isPangram(PanagramConstants.JUTE_BAGS));
		log.error("Panagram check for "+ PanagramConstants.MAD_BOXER + "  -> "  + PanagramChecker.isPangram(PanagramConstants.MAD_BOXER));
		log.error("Panagram check for "+ PanagramConstants.QUICK_BROWN_FIX + "  -> "  + PanagramChecker.isPangram(PanagramConstants.QUICK_BROWN_FIX));
		log.error("Panagram check for "+ PanagramConstants.RAZOR_FROGS + "  -> "  + PanagramChecker.isPangram(PanagramConstants.RAZOR_FROGS));
		log.error("Panagram check for "+ PanagramConstants.SIX_JAVELINS + "  -> "  + PanagramChecker.isPangram(PanagramConstants.SIX_JAVELINS));
		log.info("Panagram check for "+ PanagramConstants.THE_EXPLORER + "  -> "  + PanagramChecker.isPangram(PanagramConstants.THE_EXPLORER));
		log.info("Panagram check for "+ PanagramConstants.ZEAL_JOB + "  -> "  + PanagramChecker.isPangram(PanagramConstants.ZEAL_JOB));

	}

}
