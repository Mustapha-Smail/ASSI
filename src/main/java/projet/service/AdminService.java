package projet.service;

import projet.dao.AdminDAO;
import projet.model.Administrateur;

public class AdminService {

	private AdminDAO adminDAO = new AdminDAO();

	public AdminService() {}
	
	public Administrateur login(String email, String password) {
		return adminDAO.login(email, password); 	
	}
	
}
