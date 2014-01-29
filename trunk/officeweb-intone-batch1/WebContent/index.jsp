<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Title of index.jsp</title>
</head>
<body>

<%
out.println("Hello World from JSP");

%>


<%

String name = request.getParameter("name");

out.println("The name from request param is " + name);

session.setAttribute("name", "hari");

%>


<%! int id; %>
<br/>
<br/>
<%=session.getAttribute("name") %>

JSP implicit objects are: <br/>
<ul>
<li> request</li>
<li>response </li>
<li> session </li>
<li> out </li>
<li> application </li>
<li> pageContext <li>
<li> config</li>
<li> page</li>


</ul>

</body>
</html>