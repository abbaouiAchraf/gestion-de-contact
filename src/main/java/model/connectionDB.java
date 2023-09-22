package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  connectionDB{
	
	   public static Connection getConnexion(){
		   Connection conn=null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact", "root", "root");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
			return  conn;
	    }
}