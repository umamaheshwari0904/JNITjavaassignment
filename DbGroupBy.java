package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbGroupBy {
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
	ResultSet rs=st.executeQuery("select id,age from employees group by id");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getInt(2));
		
	}

		
	
	}
}
