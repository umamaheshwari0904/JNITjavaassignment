package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Choices {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/emp";
	String username="root";
	String password="Hitler0904!";
	PreparedStatement ps = null;
	Connection con=DriverManager.getConnection(url,username,password);
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the choice(1.Insert 2.Display 3.Delete)");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		ps=con.prepareStatement("insert into employees values (?,?,?,?)");
		ps.setInt(1,110);
		ps.setInt(2,34);
		ps.setString(3,"Dev");
		ps.setString(4,"Dutta");
		int x=ps.executeUpdate();
		if(x!=0)
			System.out.println("record insert");
		break;
	case 2:
		ps=con.prepareStatement("select * from employees ");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));
		break;
	case 3:
		ps = con.prepareStatement("delete from employees where id=?");
		ps.setInt(1, 104);
		int y=ps.executeUpdate();
		if(y!=0)
			System.out.println("record deleted");
		break;
	default:
		System.out.println("wrong choice");
		}
		

	}

}
