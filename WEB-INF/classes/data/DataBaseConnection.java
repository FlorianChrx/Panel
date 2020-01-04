package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	private static Connection con;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (con == null) {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql:site", "pi", "Gtw7h8M2");
		}
		return con;
	}
}
