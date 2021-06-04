<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>..::Almacen::..</title>
</head>
<body>
    <table border="5%" style="width: 100%" bgcolor="#BDBDBD">
  	<jsp:include page="Estado.jsp" />  
	<br></br>
	<br></br>
	
    </table>

	<h1 align="center"> ..:: Register Bank::..</h1>
	
	<table  align="center" border="1" bgcolor="grey">
	<br></br>
	<br></br>
		<tr>
			
			<td><a href="<%="Profileservlet?opc2=1"%>"><button>Admin</button></a><td>
			<td><a href="<%="Profileservlet?opc2=2"%>"><button>Advisor</button></a><td>
			<td><a href="<%="Profileservlet?opc2=3"%>"><button>Costumer</button></a><td>
		</tr>
	
	</table>

 <form action="<%=request.getContextPath()%>/Costumerservlet" method="post">
	<table border="5%" style="width: 30%" bgcolor="#BDBDBD" align="center">

			<tr>
				<center>
					<td>Type Identification</td>
					<center />
					<center>
						<td><select aria-label="Type" name="tyId">
								<option value="CC">CC</option>
								<option value="CE">CE</option>
								<option value="TI">TI</option>
								<option value="PA">Pasaport</option>
						</select></td>
						<center />
			</tr>
			<TR>
				<center>
					<TD>Identification</TD>
					<center />
					<center>
						<td><input type="text" name="identification"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>First Name</TD>
					<center />
					<center>
						<td><input type="text" name="firstName"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Last Name</TD>
					<center />
					<center>
						<td><input type="text" name="lastName"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Phone</TD>
					<center />
					<center>
						<td><input type="text" name="phone"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Address</TD>
					<center />
					<center>
						<td><input type="text" name="address"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Birth date</TD>
					<center />
					<center>
						<td><input type="date" name="birthDate"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Email</TD>
					<center />
					<center>
						<td><input type="text" name="email"/></td>
						<center />
			</TR>

			<TR>
				<center>
					<TD>Username</TD>
					<center />
					<center>
						<td><input type="text" name="username"/></td>
						<center />
			</TR>
			<TR>
				<center>
					<TD>Password</TD>
					<center />
					<center>
						<td><input type="text" name="password"/></td>
						<center />
			</TR>
			
			<TR>
				<center>
					<TD>City</TD>
					<center />
					<center>
						<td><select id="opc1" aria-label="Departament" name="typedepart" class = "/Cityservlet">
								<option value="1">Cundinamarca</option>
								<option value="2">Antoquia</option>
								<option value="3">Valle del cauca</option>
								<select></td>
						<center />
			</TR>

		</table>
		<br>
		<center>
			<input type="submit" value="Register"/>			
		</center>
		<br>
	
			</table>
	</form>
	
</body>
</html>