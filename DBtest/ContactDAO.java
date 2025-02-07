package DBtest;

import java.sql.*;
import AddressBook.Contact;

public class ContactDAO {
    private Connection con;
    ResultSet rs;

    ContactDAO() throws SQLException {
        con = new DBConnect().con;
    }

    void saveContact(Contact c) throws SQLException {
        // Statement for preparing data
        String sql = "INSERT INTO Contacts(id, name, email, location, gender, language, bloodgroup)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, c.getID());
        statement.setString(2, c.getName());
        statement.setString(3, c.getEmail());
        statement.setString(4, c.getLocation());
        statement.setString(5, c.getGender());

        String[] languages = c.getLanguages();
        String langs = "";
        for (String lang : languages) {
            langs = langs + lang + " ";
        }

        statement.setString(6, langs);
        statement.setString(7, c.getBloodGroup());
    }

    ResultSet readContact() throws SQLException {
        Statement stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM Contacts");
    }

    public static void main(String[] args) throws SQLException {
        ContactDAO contactDAO = new ContactDAO();
        ResultSet rs = contactDAO.readContact();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
}
