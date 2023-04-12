package chapter07exceptions.section02.examples.example2bank;

class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}
