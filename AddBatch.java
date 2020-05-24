package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();
	st.addBatch("insert into employees values (111,24,'riyaz','khan')");
	st.addBatch("delete from employees where id=104");
	st.executeBatch();
	
	}
}
