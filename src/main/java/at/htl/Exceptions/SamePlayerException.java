package at.htl.Exceptions;

public class SamePlayerException extends RuntimeException{
    public SamePlayerException(String message){
        super(message);
    }
}
