package java_21.exception_handling.custom_exception;

public class InsufficientFundException extends RuntimeException {
    String message;

    InsufficientFundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
