package MethodExercises;

import java.util.Scanner;

public class CurrencyConversionMethod {

    private static final double NPR_TO_USD = 0.0072;
    private static final double NPR_TO_CAD = 0.010;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in NPR: ");
        double npr = input.nextDouble();

        System.out.println("Choose conversion:");
        System.out.println("1. NPR to USD");
        System.out.println("2. NPR to CAD");
        System.out.print("Enter choice (1 or 2): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Amount in USD: " + nprToUsd(npr));
                break;
            case 2:
                System.out.println("Amount in CAD: " + nprToCad(npr));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }

    public static double nprToUsd(double npr) {
        return npr * NPR_TO_USD;
    }

    public static double nprToCad(double npr) {
        return npr * NPR_TO_CAD;
    }
}
