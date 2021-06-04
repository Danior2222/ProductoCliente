package co.com.biblio.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class Showservlet
 */
@WebServlet("/Showservlet")
public class Showservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Showservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idcostumer
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String opc = request.getParameter("opc");

		if (opc.equals("1")) {
			HttpSession session = request.getSession();
			String idcostumer = request.getParameter("idCustomer");
			SecurityLogic sec2 = new SecurityLogic();
			Customer customer = new Customer();
			customer = sec2.showus(idcostumer);
			session.setAttribute("Infcost", customer);
			System.out.println(customer);
			response.sendRedirect("Showuser.jsp");
		} else if (opc.equals("2")) {
			HttpSession session = request.getSession();
			String idcostumer = request.getParameter("idCustomer");
			SecurityLogic sec2 = new SecurityLogic();
			Customer customer = new Customer();
			customer = sec2.showus(idcostumer);
			session.setAttribute("Infcost", customer);
			System.out.println(customer);
			response.sendRedirect("Updateuser.jsp");
		}else if(opc.equals("3")) {
			HttpSession session = request.getSession();
			int fk_customer_user = Integer.parseInt(request.getParameter("idCustomer"));
			SecurityLogic userInfo = new SecurityLogic();
			Customer customer = new Customer();
			customer = userInfo.deluser(fk_customer_user);
			
			
		}

		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer idcostumer = Integer.parseInt(request.getParameter("idcostumer").trim());
		Integer idUser = Integer.parseInt(request.getParameter("idUser").trim());
		Integer fk_customer_user = Integer.parseInt(request.getParameter("fk_customer_user"));
		String identification = request.getParameter("identification");
		System.out.println(identification);
		String firstName = request.getParameter("firstName");
		System.out.println(firstName);
		String lastName = request.getParameter("lastName");
		System.out.println(lastName);
		String tyId = request.getParameter("tyId");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date birthDate = null;
		try {
			birthDate = dateFormat.parse(request.getParameter("birthDate"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(birthDate);

		String email = request.getParameter("email");
		System.out.println(email);
		String address = request.getParameter("address");
		System.out.println(address);
		String phone = request.getParameter("phone");
		System.out.println(phone);
		

		Customer customer = new Customer();
		
		
		customer.setIdcostumer(idcostumer);
		customer.setIdentification(identification);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setTyId(tyId);
		customer.setBirthDate(birthDate);
		customer.setEmail(email);
		customer.setAddress(address);
		customer.setPhone(phone);
		customer.setIdUser(idUser);
		customer.setFk_customer_user(fk_customer_user);
		
		SecurityLogic sec3 = new SecurityLogic();
		sec3.Upduser(customer); 
		sec3.deluser(fk_customer_user);
		
		response.sendRedirect("Listservlet");
		

	}
}

