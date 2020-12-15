package co.com.emerdeveloper.exceptions;

public class AuthenticationException extends AssertionError {

    public static String LOGIN = "Ocurrió un error en el inicio de sesión en el Sitio WEB";

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
