import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentDatabase {
    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "yourUsername"; // Replace with your database username
    private static final String PASS = "yourPassword"; // Replace with your database password

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Step 3: Execute a query to create the database
            System.out.println("Creating Student database...");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS StudentDB";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");

            // Step 4: Connect to the new Student database
            conn = DriverManager.getConnection(DB_URL + "StudentDB", USER, PASS);
            
            // Step 5: Create students table
            System.out.println("Creating students table...");
            sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "student_id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(100), " +
                    "address VARCHAR(255), " +
                    "program VARCHAR(100))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");
            
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block to close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
