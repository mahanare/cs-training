/**
 * 
 * Copyright (C) [2012] - [2014] CareerScale IT Consulting LLP. All rights reserved.
 * 
 * If you got benefit with this code or with our training modules or for business queries, please do drop a line at info@careerscale.in
 * 
 * Information is provided in AS IS condition.
 * 
 */
package in.careerscale.training;

/**
 * Simple Anagram Checker program that validates if the given string a panagram (english sentence having a to z characters in it) or not.
 * @author harinath
 *
 */
public class PanagramChecker {

	public static boolean isPangram(String sentence) {
		for (char character = 'A'; character <= 'Z'; character++)
			if ((sentence.indexOf(character) < 0)
					&& (sentence.indexOf((char) (character + 32)) < 0))
				return false;
		return true;
	}

}
