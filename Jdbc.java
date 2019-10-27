
package jdbc;

import java.sql.*;

public class Jdbc { 

	public static void main(String[] args) {
		int toDB = 5;
		try {
			Connection test = DriverManager.getConnection("jdbc:mysql://localhost/first?" + "user=user&password=pass");
			Statement stmt = test.createStatement();

			stmt.execute("CREATE TABLE book(" + "Author TEXT," + "Descritpion TEXT," + "Price int)");

			stmt.executeUpdate(
					"INSERT INTO book(Author,Descritpion,Price) VALUES ('Sapkowski','book about game','" + toDB + "')");
			stmt.executeUpdate("UPDATE book SET Price= '6' WHERE Author = 'Sapkowski'");

			try (ResultSet rs = stmt.executeQuery("SELECT * FROM book")) {
				while (rs.next()) {
					System.out.println("Author: " + rs.getString("Author") + " Description: "
							+ rs.getString("Descritpion") + " Price: " + rs.getString("Price") + "zł");
				}
			}
			stmt.execute("DROP TABLE book");
		} catch (SQLException t) {
			System.out.println("SQLException: " + t.getMessage());
			System.out.println("SQLState: " + t.getSQLState());
			System.out.println("VendorError: " + t.getErrorCode());
		}
	}

}
