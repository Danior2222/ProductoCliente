<%@ page import = "co.com.biblio.vo.Customer"%> 
<%@ page import = "co.com.biblio.dao.UserDao"%>
<%@ page import = "co.com.biblio.logic.SecurityLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>..::Almacen::..</title>
</head>
<body>
	<center>
		<h1>..::Login Admin::..</h1>
		<center />
		<form action="<%=request.getContextPath()%>/Usadmservlet" method="post">
			<table border="5" style="width: 25%" bgcolor="#BDBDBD">
				<TR>
					<center>
						<TD>Username</TD>
						<center />
						<center>
							<td><input type="text" name="username" /></td>
							<center />
				</TR>
				<tr>
					<center>
						<td>Password</td>
						<center />
						<center>
							<td><input type="password" name="password" /></td>
							<center />
				</tr>

			</table>
			<br>
			<div class="alert alert-warning alert-dismissable" bgcolor= "red">
				<center>
					<input type="submit" value="Login" />
					<a href="<%="/Validate.jsp"%>"><button>Atras</button></a>
					<center/>
					<strong>
						<%
							if (request.getAttribute("Warning") != null) {
								out.print(request.getAttribute("Warning"));
							}
						%>
					</strong>
		</form>
</body>
</html>