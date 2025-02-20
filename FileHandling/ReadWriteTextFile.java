package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteTextFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("students.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Ram");
            pw.println("Shyam");

            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f = new File("students.txt");
        try {
            Scanner input = new Scanner(f);
            while (input.hasNext()) {
                System.out.println(input.next());
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}