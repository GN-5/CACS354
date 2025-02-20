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

    public String getName() {
        return this.name;
    }
}
