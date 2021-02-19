package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
private Connection con =null ;

private final String URL = "jdbc:mysql://localhost:3306/Its2020";
private final String USER = "Its2020";
private final String PASS = "Its2020";

public Connection connetti() {
	try {
		if(this.con==null) {
			Class.forName("com.mysql.jdbc.Driver");
		this.con= DriverManager.getConnection(URL, USER, PASS);
		System.out.println("Siamo connessi!");	
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return this.con;
}
 public static void main(String[] args) {
	Connessione c = new Connessione();
	c.connetti();
	c.disconnetti();
}
 public void disconnetti() {
	 if(this.con!=null) {
		 try {
			this.con.close();
			System.out.println("Connessione chiusa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
}
