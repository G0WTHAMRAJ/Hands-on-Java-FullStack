package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");

		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

		} catch (SQLException e) {
			System.out.println(e);

		}
		return con;

	}

}
