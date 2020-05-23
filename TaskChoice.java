package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;	

	public class TaskChoice
	{
		public static void main(String args[]) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/emp";
			String username="root";
			String password="Hitler0904!";
			PreparedStatement ps = null;
			Connection con = DriverManager.getConnection(url, username, password);
			String s = "";
			do {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the choice(1.Insert 2.Display 3.Delete 4.Update)");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the choice 1.all columns 2. particular column(id, age)");
					int firstcase = sc.nextInt();
					switch (firstcase) 
					{
					case 1:
						ps = con.prepareStatement("insert into employees values(?,?,?,?)");
						System.out.println("Enter id, age, first and last name:");
						int value1 = sc.nextInt();
						int value2 = sc.nextInt();
						String value3 = sc.next();
						String value4 = sc.next();
						ps.setInt(1, value1);
						ps.setInt(2, value2);
						ps.setString(3, value3);
						ps.setString(4, value4);
						
						int x = ps.executeUpdate();
						if (x!= 0) {
							System.out.println("Record inserted");
						}
						break;
					case 2:
						ps = con.prepareStatement("insert into employees (id, age) values (?,?)");
						System.out.println("Enter the id and age: ");
						int value5 = sc.nextInt();
						int value6 = sc.nextInt();
						ps.setInt(1, value5);
						ps.setInt(2, value6);
						int executeUpdate = ps.executeUpdate();
						if (executeUpdate!= 0) {
							System.out.println("Record insert on id and age");
						}
						break;

					}

					break;
				case 2:
					System.out.println("Enter the choice (1. All rows and all columns 2. Particular row(id search))");
					int seccase = sc.nextInt();
					switch (seccase) {
					case 1:
						ps = con.prepareStatement("select * from employees");
						ResultSet rs = ps.executeQuery();
						while (rs.next()) {
							System.out.println(rs.getInt(1)+ " " +rs.getInt(2)+" " +rs.getString(3)+ " " + rs.getString(4));
						}
						break;
					case 2:
						ps = con.prepareStatement("select * from employees where id=?");
						System.out.println("Enter the id: ");
						int value7 = sc.nextInt();
						ps.setInt(1, value7);
						ResultSet rst = ps.executeQuery();
						while (rst.next()) {
							System.out.println(rst.getInt(1)+ " " +rst.getInt(2)+" " + rst.getString(3)+ " "+rst.getString(4) );
						}
						break;

					}

					break;
				case 3:
					System.out.println("Enter the choice (1. All rows 2. Particular row(id))");
					int thirdcase = sc.nextInt();
					switch (thirdcase) {
					case 1:
						ps = con.prepareStatement("delete from employees");
						ps.executeUpdate();
						break;
					case 2:
						ps = con.prepareStatement("delete from employees where id=?");
						System.out.println("Enter the id");
						int value8 = sc.nextInt();
						ps.setInt(1, value8);
						ps.executeUpdate();
						break;
					}
					break;
				case 4:
					System.out.println("Enter the choice (1. age 2. first)");
					int fourthcase = sc.nextInt();
					switch (fourthcase) {
					case 1:
						ps = con.prepareStatement("update employees set age=? where id=?");
						System.out.println("Enter the if and id");
						int value9 = sc.nextInt();
						int value10 = sc.nextInt();
						ps.setInt(1, value9);
						ps.setInt(2, value10);
						ps.executeUpdate();
						break;
					case 2:
						ps = con.prepareStatement("update employees set first=? where id=?");
						System.out.println("Enter the salary and id");
						String value11 = sc.next();
						int value12 = sc.nextInt();
						ps.setString(1, value11);
						ps.setInt(2, value12);
						ps.executeUpdate();
						break;
					}
					break;

				}
				System.out.println("Do you want to continue (y/n)");
				s = sc.next();

			} while (s.equals("y"));
			
			}catch(Exception e) {
			e.printStackTrace();	
			}
			}
		}

	


