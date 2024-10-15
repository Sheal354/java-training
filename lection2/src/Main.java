import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String login, password, confirmPassword;
        Scanner sc = new Scanner(System.in);
        System.out.println("Login:");
        login = sc.nextLine();
        System.out.println("Password:");
        password = sc.nextLine();
        System.out.println("Confirm password:");
        confirmPassword = sc.nextLine();
        try {
            boolean result = validate(login, password, confirmPassword);
            System.out.println(result);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]+") ) {
            throw new WrongLoginException("Wrong login: unknown symbol");
        }

        if (login.length() >= 20) {
            throw new WrongLoginException("Wrong login: too many symbols");
        }

        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Wrong password: unknown symbol");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Wrong password: too many symbols");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password: incorrect confirmation");
        }

        return true;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("WrongLoginException");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("WrongPasswordException");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}