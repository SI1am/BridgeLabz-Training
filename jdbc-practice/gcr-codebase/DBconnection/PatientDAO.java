package DBconnection;
import java.sql.*;


public class PatientDAO {


	public void registerPatient(Patient patient) throws Exception {

	    String checkSql = "SELECT COUNT(*) FROM patients WHERE phone = ?";
	    String insertSql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";

	    try (Connection conn = DBUtils.getConnection()) {


	        PreparedStatement checkStmt = conn.prepareStatement(checkSql);
	        checkStmt.setString(1, patient.getPhone());

	        ResultSet rs = checkStmt.executeQuery();
	        rs.next();

	        if (rs.getInt(1) > 0) {
	            System.out.println("Patient with this phone already exists!");
	            return;
	        }

	        PreparedStatement ps = conn.prepareStatement(insertSql);

	        ps.setString(1, patient.getName());
	        ps.setDate(2, new java.sql.Date(patient.getDob().getTime()));
	        ps.setString(3, patient.getPhone());
	        ps.setString(4, patient.getEmail());
	        ps.setString(5, patient.getAddress());
	        ps.setString(6, patient.getBloodGroup());

	        ps.executeUpdate();
	        System.out.println("Patient Registered Successfully!");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}


    public void searchPatientByName(String name) throws Exception {

        String sql = "SELECT * FROM patients WHERE name LIKE ?";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("patient_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("-----------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getAllPatients() {

        String sql = "SELECT * FROM patients";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n===== Patient List =====");

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("patient_id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("DOB: " + rs.getDate("dob"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Blood Group: " + rs.getString("blood_group"));
                System.out.println("----------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
