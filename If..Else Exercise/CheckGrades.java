import java.util.*;

public class CheckGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks;

        System.out.println("Enter your marks : ");
        marks = input.nextInt();

        if (marks > 80) {
            System.out.println("Grade : A");
        } else if ((marks > 60) && (marks < 80)) {
            System.out.println("Grade : B");
        } else if ((marks > 50) && (marks < 60)) {
            System.out.println("Grade : C");
        } else if ((marks > 45) && (marks < 50)) {
            System.out.println("Grade : D");
        } else if ((marks > 25) && (marks < 45)) {
            System.out.println("Grade : E");
        } else if ((marks < 25)) {
            System.out.println("Grade : F");
        }

        input.close();

    }
}
