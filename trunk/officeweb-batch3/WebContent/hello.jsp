<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
 <h1> This is my header in hello.jsp but in plain html</h1>
 
 
 Scriptlet demo is the code <br/>
 <%
 
 String name= request.getParameter("name");
 
 out.println("<h2> Hello this is from scriptlet and my name is "+ name+" </h2>");
 
 %>
 
 JSP expression in the code <br/>
 <h2>Hello again from html snippet, my name is  <%= name %> </h2>
 
 
 JSP declaration in the code <br/>
 
 <%! int count=10; %>
 
 the count is <%= count %>

</body>
</html>