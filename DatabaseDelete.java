package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseDelete {
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
	int x=st.executeUpdate("delete from employees where age=18");
	if(x!=0)
		System.out.println("record deleted");
	}
}
