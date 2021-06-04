package co.com.biblio.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.com.biblio.logic.SecurityLogic;
import co.com.biblio.vo.Customer;
import co.com.biblio.vo.User;

/**
 * Servlet implementation class Costumer
 */
@WebServlet("/Customerservlet")
public class Customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		

		String identification= request.getParameter("identification");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String tyId = request.getParameter("tyId");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
			Date birthDate = null;	
		try {
			birthDate = dateFormat.parse(request.getParameter("birthDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
	
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

	
		
		Customer customer = new Customer();
		User user2 = new User();
		
		user2.setUserName(username);
		user2.setPassword(password);
		
		System.out.println(user2);
		
		
		customer.setIdentification(identification);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setTyId(tyId);
		customer.setBirthDate(birthDate);
		customer.setEmail(email);
		customer.setAddress(address);
		customer.setPhone(phone);
	
		
		
		SecurityLogic sec = new SecurityLogic();
		boolean ok = sec.register(user2, customer);
		
		
		SecurityLogic sec1 = new SecurityLogic();
		List<Customer> userList = sec1.lista();

		request.setAttribute("listCustomers", userList);
		
		
		doGet(request, response);
	}

}
