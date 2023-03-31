package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			com.mysql.cj.jdbc.Driver
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondata", "root", "root");
			Statement statement=connection.createStatement();
			statement.execute("insert into person2 values(1,'naveen',12,12)");
			connection.close();
			System.out.println("data stored");
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
