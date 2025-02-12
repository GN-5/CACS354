package ExceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String text) {
        super(text);
    }
}
