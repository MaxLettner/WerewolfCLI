package at.htl.Exceptions;

public class OutOfAmmoException extends RuntimeException {
    public OutOfAmmoException(String message) {
        super(message);
    }
}
