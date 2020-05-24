package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbJoin {
	public static void main(String args[])
	{
	try {	
	Class.forName("com.mysql.cj.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	Connection con=DriverManager.getConnection(url,username,password);
	if(con!=null) 
		System.out.println("connection established");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select e.name,e.id,s.salary,d.dept from employee e JOIN salaries s ON e.name=s.name JOIN department d ON s.name=d.name");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+ " "+ rs.getInt(2)+ " "+rs.getInt(3)+" "+rs.getString(4));
		
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}	
	
	}

