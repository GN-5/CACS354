package LoopExercise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter a positive number : ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is : " + factorial);

        input.close();
    }
}
