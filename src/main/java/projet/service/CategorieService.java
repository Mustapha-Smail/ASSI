package projet.service;


import java.util.List;

import projet.dao.CategorieDAO;
import projet.model.Article;
import projet.model.Categorie;

public class CategorieService {
	
	private CategorieDAO catDao = new CategorieDAO(); 
	
	public CategorieService(){}

	public List<Categorie> getCategories() {
		return catDao.getCategories(); 
	}
	
	public List<Article> getArticlesByCategoryId(int id) {
		return catDao.getArticlesByCategoryId(id); 
	}

}
