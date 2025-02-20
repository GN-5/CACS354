package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteBinaryFile {

    public static void main(String[] args) throws Exception {
        try {
            Student mandy = new Student(1, "Mandy", "mandy@gmail.com");

            File f = new File("students.bat");

            if (f.exists()) {
                ObjectOutputStream os1 = new ObjectOutputStream(
                        new FileOutputStream("students.bat", true));
                os1.writeObject(mandy);
                os1.close();
            }

            else {
                FileOutputStream fos = new FileOutputStream("students.bat", true);
                ObjectOutputStream oos = new ObjectOutputStream(fos) {
                    protected void writeStreamHeader() throws IOException {
                        reset();
                    }
                };
                oos.writeObject(mandy);
                oos.close();
            }

            FileInputStream fis = new FileInputStream("students.bat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student obj = null;

            while ((obj = (Student) ois.readObject()) != null) {
                System.out.println("Name: " + obj.getName());
            }
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
