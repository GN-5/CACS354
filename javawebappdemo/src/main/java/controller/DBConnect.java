package controller;

import java.sql.*;

public class DBConnect {
    ResultSet rs;
    Statement st;

    public DBConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javawebappdb", "root",
                    "12345678");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean checkUser(String username, String password) {
        boolean userFound = false;
        System.out.println("Checking user for " + username);
        try {
            String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
            rs = st.executeQuery(query);
            userFound = rs.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        return userFound;
    }

    public static void main(String[] args) {
        DBConnect db = new DBConnect();
        boolean userExists = db.checkUser("gaurab", "gaurab123");
        System.out.println("User exists: " + userExists);
    }
}
