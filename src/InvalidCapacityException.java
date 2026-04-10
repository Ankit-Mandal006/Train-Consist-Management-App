// Custom exception class for domain-specific errors
public class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}