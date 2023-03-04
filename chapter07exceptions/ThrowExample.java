package chapter07exceptions;

class ThrowExample {
    public static void divideByZero() {
        // throw an exception
        throw new ArithmeticException("Trying to divide by 0");
    }
    public static void main(String[] args) {
        divideByZero();
    }
}

// Output
// Exception in thread "main" java.lang.ArithmeticException: Trying to divide by 0
//	at chapter07exceptions.ThrowExample.divideByZero(ThrowExample.java:6)
//	at chapter07exceptions.ThrowExample.main(ThrowExample.java:9)
