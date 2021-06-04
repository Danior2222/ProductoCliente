package co.com.biblio.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.com.biblio.logic.SecurityLogic;
import co.com.biblio.vo.Customer;
import co.com.biblio.vo.User;

/**
 * Servlet implementation class Listservlet
 */
@WebServlet("/Listservlet")
public class Listservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		HttpSession session = request.getSession();
		
		SecurityLogic sec1 = new SecurityLogic();
		List<Customer> aaa = sec1.lista();
		
		System.out.println("EN EL SERVLET  LISTA");	
		System.out.println("EN EL SERVLET  LISTA");
		System.out.println("EN EL SERVLET  LISTA");
		
		
		
		for(Customer a : aaa){
			System.out.println(a.toString());
		}

		
		session.setAttribute("listCustomers", aaa);		
		request.getRequestDispatcher("listusers.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}