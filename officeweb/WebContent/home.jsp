<%@page import="java.util.Date,java.util.ArrayList"%>
<html>

<head>
<title>home</title>
<link rel="stylesheet" type="text/css" href="css/site.css" />

<style type="text/css">
</style>
</head>

<body>
	<div id="container"><%@include file="header.jsp"%>
		<div id="header">
			
			Welcome to office web Mr.
			<%=(String) request.getAttribute("username")%>
		</div>
		<div id="body">

			Your login name is
			<%=request.getParameter("username")%>
			<br /> Your password is
			<%=request.getParameter("password")%>

			<br /> Login button click status
			<%=request.getParameter("login")%>

			<br /> Forgot password click status
			<%=request.getParameter("forgotPassword")%>

			<br />
		</div>
		<div id="right-side">
			<h2>Your cookies</h2>

			<!--  jsp scriptlet is followed -->
			<%
				Cookie[] cookies = request.getCookies();
				if (cookies != null)
					for (Cookie cookie : cookies) {
						out.append("Cookie name : " + cookie.getName());
						out.append("Cookie value : " + cookie.getValue() + " <br/>");
					}
			%>

			<hr />

			<!--  JSP expression -->
			the time now is
			<%=new java.util.Date()%>


			<!--  JSP declaration  -->
			<%!int id = 10;%>

			<br /> JSP variable 'id' is declared... <br />

			<%
				String name = "";
				name = request.getParameter("username");
			%>

			<h2>some JSP scriptlet output..</h2>

			<%
				out.print("The ID value IS :" + id);
				out.print("<br/>username is " + name);
			%>


			<%
				//request
				//response
				//out
				//session
				//application
				//page
				//pageContext
			%>

		</div>
	</div>

</body>

</html>

