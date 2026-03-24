import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // ADD THIS LINE

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/course_registration",
                "root",
                "root"
            );

            System.out.println("Database Connected Successfully!");
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}