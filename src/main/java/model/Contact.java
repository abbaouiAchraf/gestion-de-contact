package model;

public class Contact {
	public int id;
	public String nom;
	public String prenom;
	public int numero_tele;
	public String email;
	public Contact(int id, String nom, String prenom,int numero_tele, String email) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numero_tele = numero_tele;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumero_tele() {
		return numero_tele;
	}
	public void setNumero_tele(int numero_tele) {
		this.numero_tele = numero_tele;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}