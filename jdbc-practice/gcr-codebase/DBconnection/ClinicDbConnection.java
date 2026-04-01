package DBconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ClinicDbConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/health_clinic";
	private static final String USER = "root";
	private static final String PASSWORD = "123asdf";
	
	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database Connected Successfully!");
		} catch (SQLException e) {
			System.out.println("Connection Failed!");
			e.printStackTrace();
		}
		
		return connection;
	}
}

