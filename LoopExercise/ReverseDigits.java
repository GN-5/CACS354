package LoopExercise;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        int reversedNum = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }

        if (num < 0) {
            reversedNum *= -1;
        }

        System.out.println("Reversed number: " + reversedNum);

        input.close();

    }
}