package ExceptionHandling;

import java.lang.Exception;

public class CustomExceptionTest {
    public static void main(String[] args) throws DivideByZeroException {
        int a = 12;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            throw new DivideByZeroException("Dont divide by zero.");
        } finally {
            System.out.println("always Execute");
        }
        System.out.println("Rest of the codeblock");

    }
}
