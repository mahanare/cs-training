package in.training.careerscale;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
/**
 * Sample reference for BodyTagSupport 
 * http://www.java2s.com/Code/Java/JSP/Createyourowntagacustomtagbody.htm
 * @author hari
 *
 */
@SuppressWarnings("serial")
public class ExampleTag extends TagSupport {

	private String customProperty;
	

	public String getCustomProperty() {
		return customProperty;
	}

	public void setCustomProperty(String customProperty) {
		this.customProperty = customProperty;
	}

	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.print("<h2>example tag </h2>   the customProperty value is :"
					+ customProperty);

		} catch (IOException ioe) {
			System.out.println("Error in ExampleTag: " + ioe);
		}
		return (SKIP_BODY);
	}
}
