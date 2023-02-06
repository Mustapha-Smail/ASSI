import java.net.URL;

public class Article {
    Categorie categorie;
    String libelle; 
    String marque; 
    int prix;
    URL photo;
    
	public Article(Categorie categorie, String libelle, String marque, int prix, URL photo) {
		super();
		this.categorie = categorie;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
		this.photo = photo;
	}
	
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public URL getPhoto() {
		return photo;
	}
	public void setPhoto(URL photo) {
		this.photo = photo;
	} 
}
