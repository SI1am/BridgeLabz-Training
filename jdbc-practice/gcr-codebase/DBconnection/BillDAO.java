package DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDAO {

    public void generateBill(int visitId, double consultationFee) throws Exception {

        String sql = "INSERT INTO bills(visit_id,total_amount) VALUES(?,?)";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, visitId);
            ps.setDouble(2, consultationFee);

            ps.executeUpdate();
            System.out.println("Bill Generated!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
