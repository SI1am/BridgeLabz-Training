package DBconnection;

import java.sql.*;

public class DBUtils {
	private static final String URL ="jdbc:mysql://localhost:3306/health_clinic";
	private static final String USER ="root";
	private static final String PASS ="123asdf";
	
//	public static Connection getConnection() throws Exception{
//		return DriverManager.getConnection(URL,USER,PASS);
//	}

	public static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return DriverManager.getConnection(URL,USER,PASS);
		
	}
	
}
