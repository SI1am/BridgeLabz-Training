package DBconnection;
import java.sql.*;


public class AppointmentDAO {

    public void bookAppointment(int patientId, int doctorId, Date date, Time time) {

        String checkSql = "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date=? AND appointment_time=? AND status='SCHEDULED'";
        String insertSql = "INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,status) VALUES(?,?,?,?,?)";

        try (Connection conn = DBUtils.getConnection()) {

            conn.setAutoCommit(false);

            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, doctorId);
            checkStmt.setDate(2, date);
            checkStmt.setTime(3, time);

            ResultSet rs = checkStmt.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Slot already booked!");
                conn.rollback();
                return;
            }

            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setInt(1, patientId);
            insertStmt.setInt(2, doctorId);
            insertStmt.setDate(3, date);
            insertStmt.setTime(4, time);
            insertStmt.setString(5, "SCHEDULED");

            insertStmt.executeUpdate();
            conn.commit();

            System.out.println("Appointment Booked!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
