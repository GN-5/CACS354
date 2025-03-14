package FileHandling;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    static int noOfStudents = 48;

    private int rollNumber;
    private String name;
    private String email;

    public Student() {
    }

    public Student(int rollNumber, String name, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

}
