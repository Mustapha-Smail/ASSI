package projet.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import projet.config.DB;
import projet.model.Utilisateur;

public class UtilisateurDAO {
	
	DB db; 
	PreparedStatement requete; 
	
	public UtilisateurDAO() {
		db = new DB(); 
	}

	public Utilisateur login(String email, String password) {
		this.db.connection();
		
		Connection conn = db.getConn();
		
		Utilisateur user = null; 
		
		try {

		      requete = conn.prepareStatement("SELECT * FROM utilisateur WHERE identifiant = ? AND password = ?");
		      requete.setString(2, email);
		      requete.setString(1, password);
		      
		      ResultSet rs = requete.executeQuery();
		      
		      while (rs.next()) {
		    	  
		    	  user = new Utilisateur(rs.getString("identifiant"), rs.getString("password")); 
		    	  
		      }

		    } catch (SQLException e) {
		    	e.printStackTrace();
			} 
			
			
			this.db.deconnection();
			
			return user; 
	}
	
}
