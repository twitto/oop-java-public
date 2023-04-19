package chapter04interfaces.example03fields_and_static_methods;

// An interface is a collection of abstract methods
// and constant fields that can be implemented by classes
// A class that implements an interface must provide
// implementation for all its abstract methods
public interface Person
{

    // Constant field - any class that implements
    // this interface will have access to this constant
    int MAX_AGE = 120;

    // Abstract method - any class that implements
    // this interface must provide implementation for this method
    void walk();

    // Another abstract method
    void talk();

    // Static method - this method can be called on the interface itself,
    // rather than on an instance of a class that implements the interface
    // This method returns a random age between 0 and MAX_AGE
    static double getRandomAge()
    {
        return Math.random() * MAX_AGE;
    }
}

