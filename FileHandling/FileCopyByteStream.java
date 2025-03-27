package FileHandling;

import java.io.*;

public class FileCopyByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("FileHandling/students.txt");
            FileOutputStream output = new FileOutputStream("FileHandling/destination.txt");

            int c;
            while ((c = input.read()) != -1) {
                output.write(c);
            }

            input.close();
            output.close();
            System.out.println("File copied successfully using Byte Stream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
