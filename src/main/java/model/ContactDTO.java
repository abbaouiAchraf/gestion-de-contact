package model;

import java.sql.*;
import java.util.ArrayList;

public class ContactDTO {
	

	ResultSet rs = null;
	PreparedStatement ps = null;
	Connection conn = connectionDB.getConnexion();
	
	public void addContact(String nom, String prenom, int numero_tel, String email) {
		
	    try {
			ps = conn.prepareStatement("INSERT INTO contact values (?,?,?,?)");
			ps.setString(1, nom);
		    ps.setString(2, prenom);
		    ps.setInt(3, numero_tel);
		    ps.setString(4, email);
		    ps.executeUpdate();

		    conn.close();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	public void deleteContect(int id) {
		System.out.println("suppr");
	   try {
			ps = conn.prepareStatement("delete from contact where id=?");
		    ps.setInt(1, id);
		    ps.executeUpdate();
		    System.out.println("Contact deleted");
		    conn.close();
	   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	public void editContact(int id, String nom, String prenom, int numero_tel, String email) {
		try {
			ps = conn.prepareStatement("update contect set nom = ?, prenom = ?, numero_tel = ?, email = ? where id = ?");
		    ps.setString(1,nom);
		    ps.setString(2, prenom);
		    ps.setInt(3, numero_tel);
		    ps.setString(4, email);
		    ps.setInt(5, id);
		    ps.executeUpdate();
		    System.out.println("Contact uodated");
		    conn.close();
	   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  ArrayList<Contact> recupererContact(int id_rec){
		 ArrayList<Contact> messagesRecus=new ArrayList<Contact>();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 Connection conn = connectionDB.getConnexion();
		 try {
			ps = conn.prepareStatement("select * from contact where id=?");
			ps.setInt(1,id_rec);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenom");
				int numero_tele= rs.getInt("numero_tele") ;
				String email=rs.getString("email") ;
				Contact c = new Contact(id, nom, prenom, numero_tele, email);
				messagesRecus.add(c);
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return messagesRecus;
	}
	public  ArrayList<Contact> recupererContacts(){
		 ArrayList<Contact> messagesRecus=new ArrayList<Contact>();
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 Connection conn = connectionDB.getConnexion();
		 try {
			ps = conn.prepareStatement("select * from contact");
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String nom=rs.getString("nom");
				String prenom=rs.getString("prenom");
				int numero_tele= rs.getInt("numero_tele") ;
				String email=rs.getString("email") ;
				Contact c = new Contact(id, nom, prenom, numero_tele, email);
				messagesRecus.add(c);
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return messagesRecus;
	}
	public void insertContact(int id, String nom, String prenom, int numero_tele, String email) {
		 ResultSet rs = null;
		 PreparedStatement ps = null;
		Connection conn = connectionDB.getConnexion();
		
	    try {
			ps = conn.prepareStatement("INSERT INTO contact( id, nom, prenom, numero_tele, email) VALUES (?,?,?,?,?)");
			ps.setInt(1, id);
		    ps.setString(2, nom);
		    ps.setString(3, prenom);
		    ps.setInt(4, numero_tele);
		    ps.setString(5,email);
		    ps.executeUpdate();

		    conn.close();
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		}
	public void supprimerContact(int id) {
		 ResultSet rs = null;
		 PreparedStatement ps = null;
		Connection conn = connectionDB.getConnexion();
		System.out.println("suppr");
	   try {
			ps = conn.prepareStatement("delete from contact where id=?");
		    ps.setInt(1, id);
		    ps.executeUpdate();
		    System.out.println("fin supp");
		    conn.close();
	   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
		
	}