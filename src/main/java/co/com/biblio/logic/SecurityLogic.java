package co.com.biblio.logic;

import java.util.List;

import co.com.biblio.dao.UserDao;
import co.com.biblio.vo.Administrator;
import co.com.biblio.vo.Customer;
import co.com.biblio.vo.User;

public class SecurityLogic {

	public boolean login(User user) {

		UserDao dao = new UserDao();
		boolean r = dao.login(user);
		return r;

	}

	public boolean register(User user, Customer customer) {

		UserDao dao1 = new UserDao();
		boolean a = dao1.Register(user, customer);
		return a;
	}
	
	public boolean registeradmin(User user, Administrator administrator) {

		UserDao dao1 = new UserDao();
		boolean a = dao1.Registeradm(user, administrator);
		return a;
	}

	public List<Customer> lista() {
		UserDao dao2 = new UserDao();
		List<Customer> userList = dao2.lista();
		return userList;

	}

	public Customer showus(String idcostumer) {
		UserDao dao3 = new UserDao();
		Customer b = dao3.showuser(idcostumer);
		return b;

	}
	
	public boolean Upduser(Customer customer) {
		UserDao dao4 = new UserDao();
		boolean c = dao4.updateuser(customer);
		return c;
	
	}
	public Customer deluser(int fk_customer_user) {
		UserDao dao2 = new UserDao();
		Customer use = dao2.deleuser(fk_customer_user);
		
		return use;
	}
		
		
	
	}
