package MethodExercises;

import java.util.Scanner;

public class IntegerPalindromeCheckerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (integerPalindromeChecker(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        input.close();
    }

    public static boolean integerPalindromeChecker(int num) {
        int reversedNum = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }

        if (num < 0) {
            reversedNum *= -1;
        }

        if (num == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}
