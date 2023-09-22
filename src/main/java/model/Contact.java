package model;

public class Contact {
	public int id;
	public String nom;
	public String prenom;
	public int numero_tele;
	public String email;
	public Contact(int id, String nom, String prenom, int numero_tele, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numero_tele = numero_tele;
		this.email = email;
	}
	
}
