package projet.service;

import java.util.List;

import projet.dao.UtilisateurDAO;
import projet.model.Utilisateur;

public class UtilisateurService {

	private UtilisateurDAO uDao = new UtilisateurDAO(); 
	
	public UtilisateurService() {}
	
	public Utilisateur login(String email, String password) {
		return uDao.login(email, password); 	
	}
}
