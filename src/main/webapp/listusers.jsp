<%@page import="java.util.ArrayList"%>
<%@ page import = "co.com.biblio.dao.UserDao"%> 
<%@ page import = "co.com.biblio.vo.Customer"%> 
<%@ page import = "co.com.biblio.logic.SecurityLogic"%>
<%@ page import = "java.util.List"%> 
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

	<h1>..::Usuarios::..</h1>


	
	<table border="1" width="50%">
	<tr>
	<%
	
	
	List<Customer> aaa = new ArrayList();
	
	aaa = (List<Customer>)session.getAttribute("listCustomers");
	
	
	for(Customer c : aaa) {%>
	   <tr>
	  <td> <% out.println(c.getIdentification());%></td>
	  <td> <% out.println(c.getFirstName());%></td>
	  <td> <% out.println(c.getLastName());%></td>
	  <td> <% out.println(c.getEmail());%></td>
	  <td><a href="<%="Showservlet?opc=1&idCustomer="+c.getIdcostumer()%>"><button>See info user</button></a></a><td>
	  <td><a href="<%="Showservlet?opc=2&idCustomer="+c.getIdcostumer()%>"><button>Update user</button></a></a><td>
	  <td><a href="<%="Showservlet?opc=3&idCustomer="+c.getIdcostumer()%>"><button>Delete User</button></a></a><td>
	 
	   </tr>
	   <%}
%>

</tr>
</table>
</body>
</html>