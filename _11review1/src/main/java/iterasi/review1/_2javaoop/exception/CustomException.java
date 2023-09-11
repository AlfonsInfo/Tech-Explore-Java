package iterasi.review1._2javaoop.exception;

public class CustomException extends Exception{
    public CustomException() {
        super("");
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
