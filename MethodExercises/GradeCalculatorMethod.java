package MethodExercises;

import java.util.Scanner;

public class GradeCalculatorMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        System.out.println("Equivalent Grade: " + getGrade(marks));

        input.close();
    }

    public static String getGrade(int marks) {
        if (marks >= 70 && marks <= 100) {
            return "A";
        } else if (marks >= 60 && marks <= 69) {
            return "B";
        } else if (marks >= 50 && marks <= 59) {
            return "C";
        } else if (marks >= 40 && marks <= 49) {
            return "D";
        } else if (marks >= 5 && marks <= 39) {
            return "F";
        } else if (marks >= 0 && marks <= 4) {
            return "G";
        } else {
            return "Invalid marks";
        }
    }
}
