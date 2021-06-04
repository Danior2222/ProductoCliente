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
	
    
	
	<h1 align="center"> ..::Lobby Admin::..</h1>
	
	

 <form action="<%=request.getContextPath()%>/Profilesservlet" method="post">

   <td width="25%" height="200px"><jsp:include page="Menu.jsp" /></td>
	<table border="5%" style="width: 15%" bgcolor="#BDBDBD" >
 
              

			
			<TR>
				
					<TD width="25%" height="100px"><h3>Identification</h3></TD>
				
						<td><input type="text" name="identification"/></td>
						
			</TR>
			<TR>
				
					<TD width="25%" height="100px"><h3>First Name</h3></TD>
					
						<td><input type="text" name="firstName"/></td>
						<center />
			</TR>
			<TR>
			
					<TD width="25%" height="100px"><h3>Last Name</h3></TD>
				
						<td><input type="text" name="lastName"/></td>
						
			</TR>
			<TR>
			
					<TD width="25%" height="100px"><h3>Phone</h3></TD>
				
						<td><input type="text" name="phone"/></td>
					
			</TR>
			
		
			<TR>
			
					<TD width="25%" height="100px"><h3>Email</h3></TD>
				
						<td><input type="text" name="email"/></td>
						
			</TR>

			<TR>
				
					<TD width="25%" height="100px"><h3>Username</h3></TD>
					
						<td><input type="text" name="username"/></td>
						<center />
			</TR>
			<TR>
				
					<TD width="25%" height="100px"><h3>Password</h3></TD>
				
						<td><input type="text" height="100px" name="password"/></td>
						
			</TR>
			
			

		</table>
		<br>
		
			<input type="submit" value="Register"/>			
		    
		<br>
	
			</table>
	</form>
</body>
</html>