package com.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
	Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
	//String sql="insert into employee values(?,?,?)";
	String sql="delete from employee where id=?";
	PreparedStatement ps=con.prepareStatement(sql);
	
	//Execute Query
	
	
	 ps.setInt(1,102);        //Inserting and deleting
	//ps.setString(2,"Raj");   =>Inserting 
	//ps.setInt(3,20000);      =>Inserting
	int n=ps.executeUpdate();
	if(n==1)
		System.out.println("Deleted");
	else
		System.out.println("Not Deleted");
	ps.close();
	con.close();
		

	}

}
