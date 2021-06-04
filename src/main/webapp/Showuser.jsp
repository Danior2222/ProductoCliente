<%@ page import = "co.com.biblio.dao.UserDao"%> 
<%@ page import = "co.com.biblio.vo.Customer"%> 
<%@ page import = "co.com.biblio.logic.SecurityLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>..::Almacen::..</title>
</head>
<body>
 <table border="5%" style="width: 100%" bgcolor="#BDBDBD">
  	<jsp:include page="Estado.jsp" />  
	<br></br>
	<br></br>
	
    </table>


<style>
.categoriesDiv {width:85% !important;}
</style>
<center><div class="categoriesDiv" style="background-color:lightblue">
<h1 align="center"> ..::Information Bank::..</h1>
<%
	
	
	
			Customer customer = new Customer();
			customer = (Customer)session.getAttribute("Infcost");

%>
          <table border="1" width="80%">
          
		  <tr>
		  <td><h3>Idcustomer:</h3> <% out.println(customer.getIdcostumer());%></td>
		  <br/>
		  <td><h3>IdUser:</h3> <% out.println(customer.getIdUser());%></td>
		  <br/>
		  <td><h3>Typeid:</h3> <% out.println(customer.getTyId());%></td>
		  <br/>
		  <td><h3>Identification:</h3> <% out.println(customer.getIdentification());%></td>
		  <br/>
		  <td><h3>FirstName:</h3> <% out.println(customer.getFirstName());%></td>
		  <br/>
		  <td><h3>LastName:</h3> <% out.println(customer.getLastName());%></td>
		  <br/>
		  <td><h3>Address:</h3> <% out.println(customer.getAddress());%></td>
		  <br/>
		  <td><h3>Email:</h3> <% out.println(customer.getEmail());%></td>
		  <br/>
		  <td><h3>BirthDate:</h3> <% out.println(customer.getBirthDate());%></td>
		  <br/>
		  <td><h3>Phone:</h3> <% out.println(customer.getPhone());%></td>
	
		  </tr>
		  
          </table>
	
</div></center>
</body>
</html>