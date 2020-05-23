package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	public void databaseconnection() throws SQLException, ClassNotFoundException
	{
		
	Class.forName("com.mysql.cj.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	Connection con=DriverManager.getConnection(url,username,password);
	if(con!=null) 
	System.out.println("connection established");
	}
	public static void main(String args[]) throws Exception
	{
		DbConnection dc=new DbConnection();
		dc.databaseconnection();
	}

}
