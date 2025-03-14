package ExceptionHandling;

import java.io.File;
import java.io.FileReader;

public class ExceptionHandlingTest {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age can't be less than 18");
        } else {
            System.out.println("The " + age + " is valid");
        }
    }

    public static void main(String[] args) {
        // Exception -> unwanted situation
        // 1. Error -> Crash, can't be handled (OutOfMemoryError, StackOverflow)
        // 2. Exception ->

        // 2.1 Checked Exception(Compile Time) //IOException
        File f = new File("myfile.txt");
        try {
            FileReader fr = new FileReader(f);
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // always executes
            // resource save
            System.out.println("..inside finally block..");

        }

        // 2.2 Unchecked Exception (Runtime Exception)
        try {
            int a = 12 / 0;
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Arithmetic Exception was caught");
        }

        int arr[] = { 1, 2, 3, 4, 5 };
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("ArrayOutOfBounds Exception was caught.");
        }

        // Custom Exception
        int age = 17;
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.toString());
        } finally {
            System.out.println("Age is vlaid");
        }

    }
}
