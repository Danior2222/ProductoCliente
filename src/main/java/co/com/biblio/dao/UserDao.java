package co.com.biblio.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import co.com.biblio.vo.Administrator;
import co.com.biblio.vo.Customer;
import co.com.biblio.vo.User;

public class UserDao {

	public boolean login(User user) {
		boolean usuarioexiste = false;
		Configuration configuration = new Configuration();

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String queryString = "from User where username = :username and password= :password and idroles= 2";
		Query<?> query = session.createQuery(queryString);

		query.setParameter("username", user.getUserName());
		query.setParameter("password", user.getPassword());
		Object queryResult = query.uniqueResult();
		User user2 = (User) queryResult;

		System.out.println(user2);
		session.getTransaction().commit();
		session.close();

		if (user2 == null)
			usuarioexiste = false;
		else
			usuarioexiste = true;

		return usuarioexiste;
	}
	

	public boolean Register(User user, Customer customer) {
		boolean userRegister = false;
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {

			session.beginTransaction();

			session.save(user);
			System.out.println(user);
			System.out.println("3");
			customer.setIdUser(user.getIdUser());
			System.out.println("4");

			System.out.println(customer);
			session.save(customer);
			System.out.println("5");

			session.getTransaction().commit();
			session.close();
			System.out.println("6");
			userRegister = true;
		} catch (Exception x) {

			userRegister = false;
		}

		return userRegister;
	}

	public List<Customer> lista() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		String queryString = "from Costumer";
		Query query = session.createQuery(queryString);
		List<Customer> userList = query.list();
		session.getTransaction().commit();
		session.close();
		for (Customer cost : userList) {
			System.out.println(cost.toString());
		}
		return userList;

	}

	public Customer showuser(String idcostumer) {
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			String queryString = "from Costumer where idcostumer= :idcostumer";

			Query query = session.createQuery(queryString);
			Integer id = Integer.parseInt(idcostumer);
			query.setParameter("idcostumer", id);

			Customer customer = new Customer();
			customer = (Customer) query.uniqueResult();
			session.getTransaction().commit();


			System.out.println(customer.toString());

			return customer;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public boolean updateuser(Customer customer) {

		boolean usersRegister = false;

		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println(customer);
			session.update(customer);
			session.getTransaction().commit();
			

			session.close();
			return  true;
		} catch (Exception x) {

			System.out.println(x);
			return usersRegister;
		}

		

	}
	public Customer deleuser(int fk_customer_user) {
		
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println(":v");
			String queryUser = "from Costumer where idcostumer= :idcostumer";
			Query cus = session.createQuery(queryUser);
			cus.setParameter("idcostumer", fk_customer_user);
			Customer customer = (Customer) cus.uniqueResult();
			System.out.println("1");
			System.out.println(customer);
			System.out.println("2");
			session.delete(customer);
			session.getTransaction().commit();
			session.close();
			System.out.println("3");
			return customer;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
	
	
		
		public boolean Registeradm(User user, Administrator administrator) {
			boolean admRegister = false;
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.getCurrentSession();
			try {

				session.beginTransaction();

				session.save(administrator);
				System.out.println(administrator);
				System.out.println("3");
				administrator.setIdUser(administrator.getIdUser());
				System.out.println("4");

				System.out.println(administrator);
				session.save(administrator);
				System.out.println("5");

				session.getTransaction().commit();
				session.close();
				System.out.println("6");
				admRegister = true;
			} catch (Exception x) {

				admRegister = false;
			}

			return admRegister;
		}

	}
