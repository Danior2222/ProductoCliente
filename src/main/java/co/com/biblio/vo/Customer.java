package co.com.biblio.vo;

import java.util.Date;

public class Customer {
	private int fk_customer_user;
	private int idcostumer;
	private String identification;
	private String firstName;
	private String lastName;
	private String tyId;
	private Date birthDate;
	private String email;
	private String address;
	private String phone;
	private int idUser;
	private int iddepartament;
	private int idadvisor;
	private int idadministrator;
	private int idroles;
		

	
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdcostumer() {
		return idcostumer;
	}
	public void setIdcostumer(int idcostumer) {
		this.idcostumer = idcostumer;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTyId() {
		return tyId;
	}
	public void setTyId(String tyId) {
		this.tyId = tyId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public int getFk_customer_user() {
		return fk_customer_user;
	}
	public void setFk_customer_user(int fk_customer_user) {
		this.fk_customer_user = fk_customer_user;
	}
	public int getIddepartament() {
		return iddepartament;
	}
	public void setIddepartament(int iddepartament) {
		this.iddepartament = iddepartament;
	}
	public int getIdadvisor() {
		return idadvisor;
	}
	public void setIdadvisor(int idadvisor) {
		this.idadvisor = idadvisor;
	}
	public int getIdadministrator() {
		return idadministrator;
	}
	public void setIdadministrator(int idadministrator) {
		this.idadministrator = idadministrator;
	}
	public int getIdroles() {
		return idroles;
	}
	public void setIdroles(int idroles) {
		this.idroles = idroles;
	}
	@Override
	public String toString() {
		return "Customer [fk_customer_user=" + fk_customer_user + ", idcostumer=" + idcostumer + ", identification="
				+ identification + ", firstName=" + firstName + ", lastName=" + lastName + ", tyId=" + tyId
				+ ", birthDate=" + birthDate + ", email=" + email + ", address=" + address + ", phone=" + phone
				+ ", idUser=" + idUser + ", iddepartament=" + iddepartament + ", idadvisor=" + idadvisor
				+ ", idadministrator=" + idadministrator + ", idroles=" + idroles + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}