import java.util.ArrayList;
import java.util.Map;

public class Panier {
    Map<Article, Integer> articles; 
    int prixTotal;
    
	public Panier(ArrayList<Article> articles, int prixTotal) {
		super();
		this.articles = articles;
		this.prixTotal = prixTotal;
	}
	public ArrayList<Article> getArticles() {
		return articles;
	}
	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	public int getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	} 
    
	
}