package projet.service;


import java.util.List;

import projet.dao.CategorieDAO;
import projet.model.Article;

public class CategorieService {
	
	public CategorieService(){}
	
	public List<Article> getArticlesById(int id) {
		CategorieDAO catDao = new CategorieDAO(); 
		
		return catDao.getArticlesById(id); 
	}

}
