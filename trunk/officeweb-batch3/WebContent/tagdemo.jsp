<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/mytag.tld" prefix="custom" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tag Library demo</title>
</head>
<body>
<custom:customTag customProperty="This is java training" name="raji">
this text in the body of custom tab is useless as we are not handling it in tag java code.
</custom:customTag>
</body>
</html>