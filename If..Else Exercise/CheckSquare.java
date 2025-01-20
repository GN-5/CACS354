import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        int length, breadth;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Length :");
        length = input.nextInt();

        System.out.println("Enter Breadth :");
        breadth = input.nextInt();

        if (length == breadth) {
            System.out.println("The provided rectangle is a square.");
        }

        else {
            System.out.println("The object is not a square.");
        }

        input.close();
    }
}