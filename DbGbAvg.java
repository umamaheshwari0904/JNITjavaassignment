package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbGbAvg {
	public static void main(String args[]) throws Exception
	{
		
	Class.forName("com.mysql.cj.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	Connection con=DriverManager.getConnection(url,username,password);
	if(con!=null) 
		System.out.println("connection established");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select avg(age) from employees");
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
		
	}

		
	
	}
}
