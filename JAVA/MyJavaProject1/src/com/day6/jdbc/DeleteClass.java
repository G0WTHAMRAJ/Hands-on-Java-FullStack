package com.day6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Step-1:Loading Driver into Java
		Class.forName("org.postgresql.Driver");
		
		//Step-2:create connection with db
		Connection con=	DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
		//step-3:Creating Statement
		String sql="select * from employee";
		PreparedStatement ps=con.prepareStatement(sql);
	
		// step -4:Execute Query
		ResultSet rs=ps.executeQuery();
	
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("salary"));
		}
		rs.close();
		ps.close();
		con.close();
		

	}

}
