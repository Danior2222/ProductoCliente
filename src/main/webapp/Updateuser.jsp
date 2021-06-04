<%@ page import = "co.com.biblio.dao.UserDao"%> 
<%@ page import = "co.com.biblio.vo.Customer"%> 
<%@ page import = "co.com.biblio.logic.SecurityLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table border="5%" style="width: 100%" bgcolor="#BDBDBD">
  	<jsp:include page="Estado.jsp" />  
	<br></br>
	<br></br>
	
    </table>

<form action="<%=request.getContextPath()%>/Showservlet" method="post">
 <%
	
	
	
 			Customer customer = new Customer();
 			customer = (Customer)session.getAttribute("Infcost");

%>
          <table border="1" width="80%">
          
		  <tr>
		  <td><h3>IdCostumer:</h3>
		  <input type="text" hidden ="hidden" name="idcostumer" value="<%=customer.getIdcostumer()%>"></td>
		  <br/>
		  <td><h3>IdUser:</h3> 
		  <input type="text" hidden ="hidden" name="idUser" value="<%=customer.getIdUser()%>"></td>
		  <br/>
		  <td><h3>Typeid:</h3>
		  <input type="text" name="tyId" value=" <%=customer.getTyId()%>"></td>
		  <br/>
		  <td><h3>Identification:</h3>
		  <input type="text" name="identification" value="<%=customer.getIdentification()%>"/></td>
		  <br/>
		  <td><h3>FirstName:</h3>
		  <input type="text" name="firstName" value=" <%=customer.getFirstName()%>"></td>
		  <br/>
		  <td><h3>LastName:</h3> 
		  <input type="text" name="lastName" value="<%=customer.getLastName()%>"></td>
		  <br/>
		  <td><h3>Address:</h3> 
		  <input type="text" name="address" value="<%=customer.getAddress()%>"></td>
		  <br/>
		  <td><h3>Email:</h3> 
		  <input type="text" name="email" value="<%=customer.getEmail()%>"></td>
		  <br/>
		  <td><h3>BirthDate:</h3> 
		  <input type="text" name="birthDate" value="<%=customer.getBirthDate()%>"></td>
		  <br/>
		  <td><h3>Phone:</h3> 
		  <input type="text" name="phone" value="<%=customer.getPhone()%>"></td>
		  <br/>
	
		  
		  </tr>
		  
          </table>
          <center>
			<input type="submit" value="Update"/>			
			
			</table>
</form>
</body>
</html>