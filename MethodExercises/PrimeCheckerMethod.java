package MethodExercises;

import java.util.Scanner;

public class PrimeCheckerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        input.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }
}
