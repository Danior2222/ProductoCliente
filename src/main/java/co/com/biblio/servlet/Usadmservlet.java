package co.com.biblio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.com.biblio.logic.SecurityLogic;
import co.com.biblio.vo.User;

/**
 * Servlet implementation class Usadmservelt
 */
@WebServlet("/Usadmservlet")
public class Usadmservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usadmservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	System.out.println(username);
	
	User user = new User();
	
	user.setUserName(username);
	user.setPassword(password);
	
	SecurityLogic sec = new SecurityLogic();
	boolean ok = sec.login(user); 

	if (ok == true) {
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("username", user.getUserName());
		request.getRequestDispatcher("Admin.jsp").include(request, response);
	} else {
		request.setAttribute("Warning", "Incorrect password, try again.");
		
		request.getRequestDispatcher("Loginadm.jsp").include(request, response);
	}
	
	doGet(request, response);
		
	}
	
		
	

}

