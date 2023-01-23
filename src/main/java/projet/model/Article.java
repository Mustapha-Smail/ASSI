package projet.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Article {
	
	private String libelle; 
	private String marque; 
	private int prix; 
	private String photo;
	
	public Article() {}
	
	public Article(String libelle, String marque, int prix, String photo) {
		
		this.libelle=libelle; 
		this.marque=marque; 
		this.prix=prix; 
		this.photo=photo; 
		
	}
	
	public String getLibelle() {
		return libelle;
	}
	public String getMarque() {
		return marque;
	}
	public int getPrix() {
		return prix;
	}
	public String getPhoto() {
		return photo;
	}

	@Override
	public String toString() {
		return "Article [libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", photo=" + photo + "]";
	} 
	
	
	
}
