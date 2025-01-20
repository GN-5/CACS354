import java.util.*;

public class GreatestAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age1, age2, age3;

        System.out.println("Enter the First Person's Age : ");
        age1 = input.nextInt();

        System.out.println("Enter the Second Person's Age : ");
        age2 = input.nextInt();

        System.out.println("Enter the Third Person's Age : ");
        age3 = input.nextInt();

        int result = (age1 >= age2) ? ((age1 > age3) ? age1 : age3) : ((age2 > age3) ? age2 : age3);

        System.out.println("The greatest age among them is " + result);

        input.close();
    }
}
