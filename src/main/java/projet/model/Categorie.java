import java.util.ArrayList;

public class Categorie {
    String libelle; 
    ArrayList<Categorie> sous_categories;
    
	public Categorie(String libelle, ArrayList<Categorie> sous_categories) {
		super();
		this.libelle = libelle;
		this.sous_categories = sous_categories;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public ArrayList<Categorie> getSous_categories() {
		return sous_categories;
	}
	public void setSous_categories(ArrayList<Categorie> sous_categories) {
		this.sous_categories = sous_categories;
	} 
 
}
