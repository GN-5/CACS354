package StudentMVCApp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private Connection conn;

    public StudentModel() {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmvcdb", "root", "12345678");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Return a list of all students
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            while (rs.next()) {
                int rollNumber = rs.getInt("roll_number");
                String name = rs.getString("name");
                String email = rs.getString("email");
                studentList.add(new Student(rollNumber, name, email));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    // Insert a new student
    public boolean addStudent(String name, String email) {
        try {
            String sql = "INSERT INTO Student (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            int affectedRows = pstmt.executeUpdate();
            pstmt.close();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Updates student
    public boolean updateStudent(int rollNumber, String name, String email) {
        try {
            String sql = "UPDATE Student SET name = ?, email = ? WHERE roll_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setInt(3, rollNumber);
            int affectedRows = pstmt.executeUpdate();
            pstmt.close();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Delete student
    public boolean deleteStudent(int rollNumber) {
        try {
            String sql = "DELETE FROM Student WHERE roll_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, rollNumber);
            int affectedRows = pstmt.executeUpdate();
            pstmt.close();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static class Student {
        private int rollNumber;
        private String name;
        private String email;

        public Student(int rollNumber, String name, String email) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.email = email;
        }

        // Getters and setters
        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
