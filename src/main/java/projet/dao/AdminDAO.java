package projet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import projet.config.DB;
import projet.model.Administrateur;

public class AdminDAO {

	DB db; 
	PreparedStatement requete; 
	
	public AdminDAO() {
		db = new DB(); 
	}
	
	public Administrateur login(String email, String password) {
		this.db.connection();
		
		Connection conn = db.getConn();
		
		Administrateur user = null; 
		
		try {

		      requete = conn.prepareStatement("SELECT * FROM administrateur WHERE identifiant = ? AND password = ?");
		      requete.setString(2, email);
		      requete.setString(1, password);
		      
		      ResultSet rs = requete.executeQuery();
		      
		      while (rs.next()) {
		    	  
		    	  user = new Administrateur(rs.getString("identifiant"), rs.getString("password")); 
		    	  
		      }

		    } catch (SQLException e) {
		    	e.printStackTrace();
			} 
			
			
			this.db.deconnection();
			
			return user; 
	}
	
}
