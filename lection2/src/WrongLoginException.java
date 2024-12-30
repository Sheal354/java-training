public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("WrongLoginException");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
