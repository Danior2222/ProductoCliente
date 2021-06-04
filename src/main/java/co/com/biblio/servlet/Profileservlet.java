package co.com.biblio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.com.biblio.logic.SecurityLogic;
import co.com.biblio.vo.Administrator;
import co.com.biblio.vo.Customer;
import co.com.biblio.vo.User;

/**
 * Servlet implementation class Profileservlet
 */
@WebServlet("/Profileservlet")
public class Profileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profileservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc2 = request.getParameter("opc2");

		if (opc2.equals("1")) {
			HttpSession session = request.getSession();
			SecurityLogic sec2 = new SecurityLogic();
			Administrator administrator = new Administrator();
			User user =new User();
			sec2.registeradmin(user, administrator);
			session.setAttribute("Infadm", administrator);
			session.setAttribute("Infadm", user);
			System.out.println(administrator);
			response.sendRedirect("Admin.jsp");
		}
	
		if (opc2.equals("3")) {
			HttpSession session = request.getSession();
			SecurityLogic sec2 = new SecurityLogic();
			Customer customer = new Customer();
			sec2.Upduser(customer);
			session.setAttribute("Infcost", customer);
			System.out.println(customer);
			response.sendRedirect("Costum.jsp");
		}
		
		}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
