package tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DB.DBType;
import DB.DButil;

public class AdminManager 
{
	public static void displayAllRows() throws SQLException 
	{

		String sql = "SELECT adminId, userName, password FROM Admin";
		try (
				Connection conn = DButil.getConnection(DBType.MYSQL);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				)
				{

			System.out.println("Admin Table:");
			while (rs.next()) 
			{
				StringBuffer bf = new StringBuffer();
				bf.append(rs.getInt("adminId") + ": ");
				bf.append(rs.getString("userName") +", ");
				bf.append(rs.getString("password"));
				System.out.println(bf.toString());
			}
		}
	}
	
}
