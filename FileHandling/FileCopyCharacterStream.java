package FileHandling;

import java.io.*;

public class FileCopyCharacterStream {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("FileHandling/students.txt");
            FileWriter writer = new FileWriter("FileHandling/destination.txt");

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            reader.close();
            writer.close();
            System.out.println("File copied successfully using Character Stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
