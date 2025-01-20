import java.util.*;

public class CheckBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int years;
        int salary;
        float bonus;

        System.out.println("Input your years of Service: ");
        years = input.nextInt();

        if (years > 5) {
            System.out.println("Input your salary: ");
            salary = input.nextInt();

            bonus = (float) 0.05 * salary;
            System.out.println("The bonus amount is : " + bonus);

        } else {
            System.out.println("You have not worked long enough for a bonus. Better luck next time.");
        }
        input.close();
    }
}