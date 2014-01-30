package com.careeerscale.officeweb.tag;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
/**
 * Sample reference for BodyTagSupport 
 * http://www.java2s.com/Code/Java/JSP/Createyourowntagacustomtagbody.htm
 * @author hARI
 *
 */

/**
 * 
 * <example customProperty="hari"/>
 * @author harinath
 *
 */
@SuppressWarnings("serial")
public class ExampleTag extends TagSupport {

	private String customProperty;
	
	private String name;
	
	

	public String getCustomProperty() {
		return customProperty;
	}

	public void setCustomProperty(String customProperty) {
		this.customProperty = customProperty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.print("<h2>example tag </h2>   the customProperty value is :"
					+ customProperty);
			out.print("<h1>Name attribute </h1>" + name);
			out.print("<h1>Name attribute </h1>" + name);

		} catch (IOException ioe) {
			System.out.println("Error in ExampleTag: " + ioe);
		}
		return (SKIP_BODY);
	}
}
