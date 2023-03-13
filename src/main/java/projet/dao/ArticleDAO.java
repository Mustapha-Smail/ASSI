package projet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

				// int idArticle = rs.getInt("idArticle");
				// int idCategorie = rs.getInt("idCategorie");
				String libelle = rs.getString("libelle");
				String marque = rs.getString("marque");
				int prix = rs.getInt("prix");
				String photo = rs.getString("photo");

				article = new Article(libelle, marque, prix, photo);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.db.deconnection();

		return article;

	}

}
