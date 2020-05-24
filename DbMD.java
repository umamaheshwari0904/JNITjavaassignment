package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbMD {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	Connection con=DriverManager.getConnection(url,username,password);
	
	DatabaseMetaData dbmd=con.getMetaData();
	System.out.println(dbmd.getDriverName());
	System.out.println(dbmd.getUserName());
	System.out.println(dbmd.getDriverVersion());
	
	
	}
}
