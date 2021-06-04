package co.com.biblio.vo;


public class Administrator {
	private int idadministrator;
	private String identificationadm;
	private String usernameadm;
	private String firstnameadm;
	private String lastnameadm;
	private String phoneadm;
	private String emailadm;
	private int idadvisor;
	private int idcostumer;
	private int idUser;
	private int idroles;
	public int getIdadministrator() {
		return idadministrator;
	}
	public void setIdadministrator(int idadministrator) {
		this.idadministrator = idadministrator;
	}
	public String getIdentificationadm() {
		return identificationadm;
	}
	public void setIdentificationadm(String identificationadm) {
		this.identificationadm = identificationadm;
	}
	public String getUsernameadm() {
		return usernameadm;
	}
	public void setUsernameadm(String usernameadm) {
		this.usernameadm = usernameadm;
	}
	public String getFirstnameadm() {
		return firstnameadm;
	}
	public void setFirstnameadm(String firstnameadm) {
		this.firstnameadm = firstnameadm;
	}
	public String getLastnameadm() {
		return lastnameadm;
	}
	public void setLastnameadm(String lastnameadm) {
		this.lastnameadm = lastnameadm;
	}
	public String getPhoneadm() {
		return phoneadm;
	}
	public void setPhoneadm(String phoneadm) {
		this.phoneadm = phoneadm;
	}
	public String getEmailadm() {
		return emailadm;
	}
	public void setEmailadm(String emailadm) {
		this.emailadm = emailadm;
	}
	public int getIdadvisor() {
		return idadvisor;
	}
	public void setIdadvisor(int idadvisor) {
		this.idadvisor = idadvisor;
	}
	public int getIdcostumer() {
		return idcostumer;
	}
	public void setIdcostumer(int idcostumer) {
		this.idcostumer = idcostumer;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdroles() {
		return idroles;
	}
	public void setIdroles(int idroles) {
		this.idroles = idroles;
	}
	@Override
	public String toString() {
		return "Administrator [idadministrator=" + idadministrator + ", identificationadm=" + identificationadm
				+ ", usernameadm=" + usernameadm + ", firstnameadm=" + firstnameadm + ", lastnameadm=" + lastnameadm
				+ ", phoneadm=" + phoneadm + ", emailadm=" + emailadm + ", idadvisor=" + idadvisor + ", idcostumer="
				+ idcostumer + ", idUser=" + idUser + ", idroles=" + idroles + "]";
	}
	
	

}

