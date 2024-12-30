public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("WrongPasswordException");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}