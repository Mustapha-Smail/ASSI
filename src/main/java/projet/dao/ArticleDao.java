package projet.dao;

import java.util.ArrayList;
import java.util.List;

import projet.model.Article;

public enum ArticleDao {
	instance; 
	private List<Article> contentprovider = new ArrayList<>(); 
	
	private ArticleDao() {
		Article art1 = new Article("libelle", "marque" , 10, "photo"); 
		contentprovider.add(art1); 
	}
	
	public List<Article> getModel(){
		return contentprovider; 
	}
	
	public Article getOne() {
		return new Article("libelle", "marque" , 10, "photo"); 
	}
}
