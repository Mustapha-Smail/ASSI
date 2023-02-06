package projet.model;

import java.util.ArrayList;

public class Utilisateur extends User {
	Panier panier;
	ArrayList<Commande> commandes; 
	
	public Utilisateur(String identifiant, String password) {
		super(identifiant, password); 
	}

	@Override
	public void ajouter(Article article) {
		
	}

	@Override
	public void modifier(Article article) {
	
	}

	@Override
	public void supprimer(Article article) {
		
	}

}
