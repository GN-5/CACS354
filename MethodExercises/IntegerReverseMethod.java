package MethodExercises;

import java.util.Scanner;

public class IntegerReverseMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("The revered integer is: " + integerReverse(num));
        input.close();
    }

    public static int integerReverse(int num) {
        int reversedNum = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }

        if (num < 0) {
            reversedNum *= -1;
        }
        return reversedNum;
    }
}
