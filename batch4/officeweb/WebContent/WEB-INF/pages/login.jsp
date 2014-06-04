
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/site.css" />
<title>Login Form</title>
<jsp:include page="common.jsp"></jsp:include>
</head>
<script type="text/javascript">
	$().ready(function() {
		// validate signup form on keyup and submit
		$("#loginForm").validate();
	});

	$(document).ready(
			function() {


				$('a').click(function(e) {
					var targetUrl = $(this).attr("href");

					var $dialog = $('#myDiv').dialog({
						autoOpen : false,
						model : true,
						title : 'Basic Dialog',
						buttons : {
							"Confirm" : function() {
								window.location.href = targetUrl;
							},
							"Cancel" : function() {
								$(this).dialog("close");
							}
						}

					});
					$dialog.dialog('open');
					// prevent the default action, e.g., following a link
					e.preventDefault();
					
					return false;
				});

			});
</script>
</head>

<body>

<div id='myDiv' style="display:none">These hyper links are demo of jquery UI dialog...</div>
	<a href="http://google.com"> some link</a>
	<a href="http://yahoo.com"> some other link</a>
	<table width="960px" align="center">
		<tr>
			<td><%@include file='header.jsp'%></td>
		</tr>
		<tr>
			<td>
				<form class='demoForm' name="loginForm" id="loginForm" method="POST"
					action="login">

					<fieldset>
						<legend>Employee Login</legend>

						<p>
							<label for="username">User Name</label> <input id="username"
								name="username"
								value=<%=request.getParameter("username") == null ? "''" : "'"
					+ request.getParameter("firstname") + "'"%>
								class="required" minLength=2 />
						</p>
						<p>
							<label for="password">Password</label> <input type="password"
								id="password" name="password" class="required" />
						</p>
						<p>
							<input class="submit" type="submit" name="login"
								value="Submit Login" />
						</p>

						<p>
							<input class="submit" type="submit" name="forgotPassword"
								value="Forgot Password" />
						</p>
						<p>
							Don't have an account yet? Click <a href="register">Here</a> to
							get one.
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

