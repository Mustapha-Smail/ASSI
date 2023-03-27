package projet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projet.config.DB;
import projet.model.Article;

public class ArticleDAO {

	DB db;
	PreparedStatement requete;

	public ArticleDAO() {
		db = new DB();
	}

	public Article getArticleDetails(int id) {

		this.db.connection();

		Connection conn = db.getConn();

		Article article = null;

		try {

			requete = conn.prepareStatement("SELECT * from article WHERE  idArticle = ?");
			requete.setInt(1, id);

			ResultSet rs = requete.executeQuery();
			while (rs.next()) {

				int idArticle = rs.getInt("idArticle");
				// int idCategorie = rs.getInt("idCategorie");
				String libelle = rs.getString("libelle");
				String marque = rs.getString("marque");
				int prix = rs.getInt("prix");
				String photo = rs.getString("photo");

				article = new Article(idArticle, libelle, marque, prix, photo);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.db.deconnection();

		return article;

	}
	
	public List<Article> getArticlesByCategory(int idCategorie){
		this.db.connection();

		Connection conn = db.getConn();
		
		List<Article> articles = new ArrayList<Article>();
		
		try {
			
			requete = conn.prepareStatement("SELECT * from article WHERE  idCategorie = ?");
			requete.setInt(1, idCategorie);

			ResultSet rs = requete.executeQuery();
			while (rs.next()) {

				int idArticle = rs.getInt("idArticle");
				// int idCategorie = rs.getInt("idCategorie");
				String libelle = rs.getString("libelle");
				String marque = rs.getString("marque");
				int prix = rs.getInt("prix");
				String photo = rs.getString("photo");

				articles.add(new Article(idArticle, libelle, marque, prix, photo));

			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		this.db.deconnection();
		
		return articles; 
	}

}
