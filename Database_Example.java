package p4;
import java.sql.*;

public class Database_Example {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/32412_ajp";
        String username = "root";
        String password = "te6412";

        // Load and register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establishing the connection
        Connection con = DriverManager.getConnection(url, username, password);

        // Creating a statement
        Statement statement = con.createStatement();

        // Query: Select all rows from Student_k6
        String query = "SELECT * FROM Student_k6";
        ResultSet rs = statement.executeQuery(query);
        System.out.println("Query Result:");
        // Process the result
        while (rs.next()) {
            System.out.println("rollno: " + rs.getInt("rollno") + ", Sname: " +
                    rs.getString("Sname") + ", marks: " + rs.getInt("marks"));
        }
        System.out.println();

        // Close the connection
        rs.close();
        statement.close();
        con.close();
    }
}
