<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>
<!--  http://www.javatpoint.com/struts-2-registration-form-example  -->
<!--  http://struts.apache.org/release/2.3.x/docs/hello-world-using-struts-2.html  -->
<body>
	<h1>Registration Form</h1>


	<s:form action="registerAction">
		<s:textfield name="userName" label="User Name"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:textfield name="firstName" label="First Name"></s:textfield>
		<s:textfield name="lastName" label="Last Name"></s:textfield>
		<s:submit value="register"></s:submit>

	</s:form>


</body>
</html>