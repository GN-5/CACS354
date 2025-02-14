import java.util.*;

public class CheckAttendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int classHeld, classAttended;
        int attendance;

        System.out.println("Enter the number of classes held : ");
        classHeld = input.nextInt();

        System.out.println("Enter the number of classes attended : ");
        classAttended = input.nextInt();

        attendance = (classAttended / classHeld);

        if (attendance < 0.75) {
            System.out.println("You are not allowed to sit in the examination.");
        } else {
            System.out.println("You are allowed to sit in the examination");
        }

        input.close();
    }
}
