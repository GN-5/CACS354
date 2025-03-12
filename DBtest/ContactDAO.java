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
        String sql = "INSERT INTO Contacts(id, name, email, location, gender, language, bloodgroup) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, c.getID());
        statement.setString(2, c.getName());
        statement.setString(3, c.getEmail());
        statement.setString(4, c.getLocation());
        statement.setString(5, c.getGender());

        String langs = String.join(" ", c.getLanguages());
        statement.setString(6, langs);
        statement.setString(7, c.getBloodGroup());

        statement.executeUpdate();
    }

    ResultSet readContact() throws SQLException {
        Statement stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM Contacts");
    }

    int updateContact(int id, Contact c) throws SQLException {
        String sql = "UPDATE Contacts SET name = ?, email = ?, location = ?, gender = ?, language = ?, bloodgroup = ? WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, c.getName());
        statement.setString(2, c.getEmail());
        statement.setString(3, c.getLocation());
        statement.setString(4, c.getGender());

        String langs = String.join(" ", c.getLanguages());
        statement.setString(5, langs);
        statement.setString(6, c.getBloodGroup());
        statement.setInt(7, id);

        return statement.executeUpdate();
    }

    Contact getContactById(int id) throws SQLException {
        String sql = "SELECT * FROM Contacts WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            return new Contact(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("gender"));
        }
        return null;
    }

    boolean deleteStudent(int id) throws SQLException {
        String sql = "DELETE FROM Contacts WHERE id = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, id);
        return statement.executeUpdate() > 0;
    }

    public static void main(String[] args) throws SQLException {
        ContactDAO contactDAO = new ContactDAO();
        ResultSet rs = contactDAO.readContact();
        Contact contact = contactDAO.getContactById(1);

        System.out.println(contact.toString());

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
}
