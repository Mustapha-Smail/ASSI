package projet.model;

public abstract class User {
	
	private String identifiant; 
	private String password; 
	
	public User() {}
	public User(String identifiant, String password) {
		this.identifiant=identifiant; 
		this.password=password; 
	}
	
	public String getIdentifiant() { return this.identifiant; }
	public String getPassword() { return this.password; }
	
	public boolean connexion(String identifiant, String password) {
		return this.identifiant.equals(identifiant) && this.password.equals(password); 
	};
	
	public boolean deconnexion() { return true; }
	
	public abstract void ajouter(Article article); 
	public abstract void modifier(Article article); 
	public abstract void supprimer(Article article); 
	
	
}
