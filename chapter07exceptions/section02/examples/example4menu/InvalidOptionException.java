package chapter07exceptions.section02.examples.example4menu;

public class InvalidOptionException extends Exception {
    public InvalidOptionException() {
        super("Invalid option selected.");
    }
}