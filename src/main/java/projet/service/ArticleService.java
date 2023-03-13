package projet.service;

import java.util.List;

import projet.dao.ArticleDAO;
import projet.model.Article;

public class ArticleService {
	
	public ArticleService() {}
	
	public Article getArticleById(int id) {
		ArticleDAO artDao = new ArticleDAO(); 
		
		return artDao.getArticleDetails(id); 
	}
}
