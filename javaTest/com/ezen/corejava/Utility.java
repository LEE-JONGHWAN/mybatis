package com.ezen.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	public static Connection getConnection() {   
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Connection conn = null;
		try {
				conn = DriverManager.getConnection(
					"jdbc:mariadb://localhost/test?user=myself" 
					+ "&password=1234&useSSL=false&"
					+ "serverTimezone=Asia/Seoul");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn; 
	}

}
