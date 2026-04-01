package DBconnection;
import java.sql.Connection;


public class TestConnection {

    public static void main(String[] args) {

        Connection conn = ClinicDbConnection.getConnection();

        if (conn != null) {
            System.out.println("Connection Successful!");
        }
    }
}