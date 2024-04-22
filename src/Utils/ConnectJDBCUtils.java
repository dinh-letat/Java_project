package Utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectJDBCUtils {
	
	private static String DB_URL = "jdbc:sqlserver://localhost:1433;databasename=QLCHTLN;encrypt=true;trustServerCertificate=true";
	private static String User_Name = "sa";
	private static String Password = "sa123";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, User_Name, Password);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
