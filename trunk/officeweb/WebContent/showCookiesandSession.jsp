<html>

<head>
<title>home</title>
<style type="text/css">
#login-table{border: thick;border-width: thick; font: bold;font-size: large; border-style: solid;}

*.myStyle{font: bolder; font-size: xx-large; color:red; border-width: thick; border-color: red}
</style>
</head>

<body>
	 <br/>
     
     <h2> Your cookies</h2>
      <%
      
      
      Cookie[] cookies =request.getCookies();
      if(cookies !=null)
		for (Cookie cookie : cookies) {
  		out.append("Cookie name : " + cookie.getName() +"  ");
		out.append("Cookie value : " + cookie.getValue() + " <br/>");
		}
	
      %>

<hr/>
<h2>Session data</h2>
<%

out.append("Your username from session is : " +(String)session.getAttribute("username"));

%>
</body>

</html>

