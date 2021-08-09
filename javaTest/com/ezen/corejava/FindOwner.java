package com.ezen.corejava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindOwner {

	public static void main(String[] args) {
		Connection conn = Utility.getConnection();
		try {
			Statement selectStmt = conn.createStatement();
			String sql = "SELECT get_pet_owner('누리') AS owner";
			ResultSet result = selectStmt.executeQuery(sql);
			while (result.next()) {
				String ownerName = result.getString("owner");
				System.out.println("애완동물 주인: " + ownerName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
