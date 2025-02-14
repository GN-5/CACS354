package MethodExercises;

import java.util.Scanner;

public class StringPalindromeCheckerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        if (stringPalindromeChecker(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        input.close();
    }

    public static Boolean stringPalindromeChecker(String word) {
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }

        if (word.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }
}
