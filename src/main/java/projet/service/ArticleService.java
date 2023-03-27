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
}
