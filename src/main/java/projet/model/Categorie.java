package projet.model;

public class Categorie {
    private String libelle;  
    private int idCategorie; 
    private int upCategorie;
    
	public Categorie(String libelle, int idCategorie, int upCategorie) {
		this.libelle = libelle;
		this.idCategorie = idCategorie;
		this.upCategorie = upCategorie;
	}

	public Categorie(String libelle, int idCategorie) {
		this.libelle = libelle;
		this.idCategorie = idCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public int getUpCategorie() {
		return upCategorie;
	}

	public void setUpCategorie(int upCategorie) {
		this.upCategorie = upCategorie;
	}

	@Override
	public String toString() {
		return "Categorie [libelle=" + libelle + ", idCategorie=" + idCategorie + ", upCategorie=" + upCategorie + "]";
	}
    
    
    
}
