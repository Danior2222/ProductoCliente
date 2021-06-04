<%@ page import = "co.com.biblio.vo.Customer"%> 
<%@ page import = "co.com.biblio.vo.Advisor"%> 
<%@ page import = "co.com.biblio.vo.User"%>
<%@ page import = "co.com.biblio.vo.Administrator"%> 
<%@ page import = "co.com.biblio.dao.UserDao"%>
<%@ page import = "co.com.biblio.logic.SecurityLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validate</title>
</head>
<body>
    <center><h1>..::Select your Rol::..</h1></center>
   
 <center><table>
   <form action="<%=request.getContextPath()%>/Usadmservlet" method="post">
     <center><td><a href="<%="Usadmservlet"%>"><button>Administrator</button></a></a><td><center>
     </form>
      <form action="<%=request.getContextPath()%>/Usadvservlet" method="post">
    <center><td><a href="<%="Usadvservlet"%>"><button>Advisor</button></a></a><td></center>
     </form>
     <form action="<%=request.getContextPath()%>/Userservlet" method="post">
    <center><td><td><a href="<%="Userservlet"%>"><button>Costumer</button></a></a><td></center>
    </form>
    </table></center>
   

</body>
</html>