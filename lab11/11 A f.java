import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecordFromRegistration {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String USER = "yourUsername"; 
    private static final String PASS = "yourPassword"; 

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Deleting record for student with ID 101...");
            String sql = "DELETE FROM Registration WHERE id = ?";
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, 101);
            stmt.executeUpdate();

            System.out.println("Record deleted successfully...");

        } catch (SQLException | ClassNotFoundException se) {
            se.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
