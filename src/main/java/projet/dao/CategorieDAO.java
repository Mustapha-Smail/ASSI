package projet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projet.config.DB;
import projet.model.Article;

public class CategorieDAO {
	
	DB db; 
	PreparedStatement requete; 
	
	public CategorieDAO() {
		db = new DB(); 
	}
	
	public List<Article> getArticlesById(int id) {
		
		this.db.connection();
		
		Connection conn = db.getConn();
		
		List<Article> articles = new ArrayList<Article>(); 
		
		try {
			
			requete = conn.prepareStatement("SELECT * from article WHERE  idCategorie = ?");
			requete.setInt(1, id);
			
			ResultSet rs = requete.executeQuery(); 
			while (rs.next()) {
				
				//int idArticle = rs.getInt("idArticle");
				//int idCategorie = rs.getInt("idCategorie"); 
				String libelle = rs.getString("libelle"); 
				String marque = rs.getString("marque"); 
				int prix = rs.getInt("prix"); 
				String photo = rs.getString("photo"); 
				
				Article article = new Article(libelle, marque, prix, photo); 
				
				articles.add(article); 
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		this.db.deconnection();
		
		return articles;
		
	}
	
	
}
