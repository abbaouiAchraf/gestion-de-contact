package model;

import java.sql.*;

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

}
