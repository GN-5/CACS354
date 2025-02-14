package MethodExercises;

import java.util.Scanner;

public class StringReverseMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        System.out.println("The reverse of " + word + " is: " + stringReverse(word));

        input.close();
    }

    public static String stringReverse(String word) {
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }

        return reversedString;
    }
}
