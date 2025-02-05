package DBtest;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {
    private static Connection con;
    static ResultSet rs;

    static String db = "jdbc:mysql://localhost:3306/addressbookdb";
    static String userName = "root";
    static String password = "12345678";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(db, userName, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        Statement stmt;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Contacts");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
