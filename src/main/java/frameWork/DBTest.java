package frameWork;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
	// Connection object
	static Connection con = null;
	// Statement object
	private static Statement stmt;
	// Constant for Database URL
	public static String DB_URL = 
			"jdbc:sqlserver:VM-W2012-SQL14;databaseName=PATRICIA_TEST_60_ORG";
	// Constant for Database Username
	public static String DB_USER = "sa";
	// Constant for Database Password
	public static String DB_PASSWORD = "Password123";

	@BeforeTest
	public void setUp() throws Exception {
		try {
			// Make the database connection
			String dbClass = "com.mysql.cj.jdbc.Driver";
			Class.forName(dbClass).newInstance();
			// Get connection to DB
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// Statement object to send the SQL statement to the Database
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		try {
			String query = "select * from person";
			// Get the contents of userinfo table from DB
			ResultSet res = stmt.executeQuery(query);
			while (res.next()) {
				System.out.print(res.getInt("LOGIN_ID"));
				System.out.print("  " + res.getInt("LOGIN_PASSWORD"));
				System.out.print("  " + res.getInt("DEPARTMENT_ID"));
				System.out.println("    " + res.getInt("SIGNATURE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void close() throws Exception {
		// Close DB connection
		if (con != null) {
			con.close();
		}
	}
}