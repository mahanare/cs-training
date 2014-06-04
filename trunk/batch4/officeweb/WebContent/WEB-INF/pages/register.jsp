<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register new employee</title>
<jsp:include page="common.jsp"></jsp:include>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$("#dob").datepicker({
			showOn : "button",
			buttonImage : "images/ico_calendar.gif",
			buttonImageOnly : true,
			appendText : ' DD/MM/YYYY ',
			buttonText : 'Date selector 1',
			align : "middle",
			changeMonth : true,
			changeYear : true,
			defaultDate : null,
			showOn : 'both',
			alt : 'Date Selector 1',
			cursor : 'pointer',
			dateFormat : 'dd/mm/yy',
			beforeShow : function(input, inst) {
				$('ui-widget-header').css({
					"color" : 'red',
					"width" : "100%"
				});
			}

		});

	});

	$()
			.ready(
					function() {
						// validate signup form on keyup and submit
						$("#signupForm")
								.validate(
										{
											rules : {
												firstname : "required",
												lastname : "required",
												username : {
													required : true,
													minlength : 2
												},
												password : {
													required : true,
													minlength : 5
												},
												confirm_password : {
													required : true,
													minlength : 5,
													equalTo : "#password"
												},
												email : {
													required : true,
													email : true
												},
												agree : "required"
											},

											dob : {
												required : true,
												minlength : 10
											},

											messages : {
												firstname : "Please enter your firstname",
												lastname : "Please enter your lastname",
												username : {
													required : "Please enter a username",
													minlength : "Your username must consist of at least 2 characters"
												},
												password : {
													required : "Please provide a password",
													minlength : "Your password must be at least 5 characters long"
												},
												confirm_password : {
													required : "Please provide a password",
													minlength : "Your password must be at least 5 characters long",
													equalTo : "Please enter the same password as above"
												},
												dob : {
													required : "Please provide your birth date",
													minlength : "Your birth date must be 10 characters and in dd/mm/yyyy format"
												},
												email : "Please enter a valid email address"
											}
										});
					});
</script>
</head>
<body>
	<table width="960px" align="center">

		<tr>
			<td><%@include file='header.jsp'%></td>
		</tr>
		<tr>
			<td>
				<form class="demoForm" id="signupForm" method="post"
					action="register">
					<fieldset>
						<legend>Employee Registration</legend>
						
							<!--  Let us show errors here -->
						<div class="errorMessage" align="center">
							<%
								if (request.getAttribute("error") != null) {
									out.print(request.getAttribute("error"));
								}
							%>
                          </div>
							<p>
								<label for="username">User Name</label> <input id="username"
									name="username"
									value=<%=request.getParameter("username") == null ? "''" : "'"
					+ request.getParameter("username") + "'"%> />
							</p>
							<p>
								<label for="password">Password</label> <input id="password"
									name="password" type="password" />
							</p>

							<p>
								<label for="confirm_password">Confirm password</label> <input
									id="confirm_password" name="confirm_password" type="password" />
							</p>
							

							<p>
								<label for="firstname">Firstname</label> <input id="firstname"
									name="firstname"
									value=<%=request.getParameter("firstname") == null ? "''" : "'"
					+ request.getParameter("firstname") + "'"%> />
							</p>
							<p>
								<label for="lastname">Lastname</label> <input id="lastname"
									name="lastname"
									value=<%=request.getParameter("lastname") == null ? "''" : "'"
					+ request.getParameter("lastname") + "'"%> />
							</p>

														<p>
								<label for="email">Email</label> <input id="email" name="email"
									type="email" value=<%=request.getParameter("email") == null ? "''" : "'"
					+ request.getParameter("email") + "'"%>    />
							</p>

							<p>
								<label for="dob">Birth Date</label> <input id="dob" name="dob"
									maxlength="10" />
							</p>
						
							
						<%-- 	<p>
								<label for="department">Select Department</label> <select name="department">
								<%
								 
								Map<Integer, String> departments = (Map<Integer, String>) request.getAttribute("departments");
								 Set<Integer> keys =departments.keySet();
								    Iterator<Integer> ir = keys.iterator();
								    
								    while(ir.hasNext()){
								    	Integer id = ir.next();
								    	out.append("<option value=" + id + ">" + departments.get(id) + "</option>");
								    }
								 
										
								%>
								
								</select>
							</p>
							 --%>
							
							
							<p>
								<label for="department">Select Department</label> <select name="department">
									<c:forEach items="${departments}" var="option">
										<option value="${option.key}">${option.value}</option>
									</c:forEach>
								</select>
							</p>

							<p>
								<label for="designation">Select Designation</label> <select name="designation">
									<c:forEach items="${designations}" var="option">
										<option value="${option.key}">${option.value}</option>
									</c:forEach>
								</select>
							</p>

<p>
								<label for="manager">Select Manager Name</label>
								 <select name="manager">
									<c:forEach items="${managers}" var="option">
										<option value="${option.key}">${option.value}</option>
									</c:forEach>
								</select>
							</p>
							<p>
								<input class="submit" type="submit" value="Submit" />
							</p>
					</fieldset>
				</form>

			</td>
		</tr>
		<tr>
			<td><%@include file='footer.jsp'%></td>
		</tr>
	</table>


</body>
</html>