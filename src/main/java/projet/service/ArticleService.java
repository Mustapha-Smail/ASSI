package projet.service;

import java.util.List;

import projet.dao.ArticleDAO;
import projet.model.Article;

public class ArticleService {
	
	private ArticleDAO artDao = new ArticleDAO(); 
	
	public ArticleService() {}
	
	public Article getArticleById(int id) {
		
		return artDao.getArticleDetails(id); 
	}
	

	public List<Article> getArticlesByCategory(int idCategorie) {
		
		return artDao.getArticlesByCategory(idCategorie); 
	}
	
	public Article editArticle(int idArticle, String libelle, String marque, int prix, String photo ) {
		return artDao.editArticle(idArticle, libelle, marque, prix, photo); 
	}
	
	public int deleteArticle(int idArticle) {
		return artDao.deleteArticle(idArticle); 
	}
	
	public int addArticle(int idCategorie, String libelle, String marque, int prix, String photo) {
		return artDao.addArticle(idCategorie, libelle, marque, prix, photo); 
	}
}
