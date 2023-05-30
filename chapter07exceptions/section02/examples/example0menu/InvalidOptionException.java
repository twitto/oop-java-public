package chapter07exceptions.section02.examples.example0menu;

public class InvalidOptionException extends Exception
{
    public InvalidOptionException() {
        super("Invalid option selected.");
    }
    public InvalidOptionException(String msg) {
        super(msg);
    }
}