package model.exception;

public class ContactNotExistException extends RuntimeException{
    public ContactNotExistException(String message){
        super(message);
    }
}
