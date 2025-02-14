/*
 * @Author - Gaurab Neupane
 */

package LoopExercise;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer : ");
        int number = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }

        input.close();

    }
}
