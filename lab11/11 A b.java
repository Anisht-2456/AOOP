import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateRegistrationTable {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/StudentDB";
    private static final String USER = "yourUsername"; 
    private static final String PASS = "yourPassword"; 

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to StudentDB database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating Registration table...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Registration (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "address VARCHAR(255) NOT NULL, " +
                    "program VARCHAR(100) NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
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
