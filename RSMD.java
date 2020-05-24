package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RSMD {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement ps=con.prepareStatement("select * from employees");
	ResultSet rs=ps.executeQuery();
	ResultSetMetaData rsmd=rs.getMetaData();
	System.out.println("total colulmn" +rsmd.getColumnCount());
	System.out.println(" 4th column name" +rsmd.getColumnName(4));
	System.out.println("4th colulmn type"+rsmd.getColumnTypeName(4));
	
	
	}
}
