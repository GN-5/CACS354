package MethodExercises;

import java.util.Scanner;

public class TemperatureConversionMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.print("Enter choice (1 or 2): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(celsius));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
