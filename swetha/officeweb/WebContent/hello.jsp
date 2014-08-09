<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.ArrayList,java.util.List"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP example</title>
</head>
<body>

<h1> Hello</h1>
<%! String name;


%>
<%

out.write("Hello<br/>");
String name =request.getParameter("name");
out.write(name);
//request
//response
//session
//application  - Servlet context

//config
//pageContext
ArrayList list = new ArrayList();
HashSet set = new HashSet();




%>


and we are good with JSP now <%=name %>

</body>
</html>