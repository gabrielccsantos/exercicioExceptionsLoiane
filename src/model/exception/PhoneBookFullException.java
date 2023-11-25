package model.exception;

public class PhoneBookFullException extends RuntimeException{
    public PhoneBookFullException(String message) {
        super(message);
    }
}
