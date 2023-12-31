package exams.oop23b_scecs.oop23b_scecs_moedb.q1_complex_number;

public class ComplexNumber
{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString()
    {
        if (imaginary >= 0)
            return real + " + " + imaginary + "i";
        else
            return real + " + (" + imaginary + ")i";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        ComplexNumber other = (ComplexNumber) obj;
        return real == other.real && imaginary == other.imaginary;
        // another way to do it is by using an epsilon-based comparison.
    }

    public void add(ComplexNumber other)
    {
        real += other.real;
        imaginary += other.imaginary;
    }

    public void multiply(ComplexNumber other)
    {
        double newReal = (real * other.real) - (imaginary * other.imaginary);
        double newImaginary = (real * other.imaginary) + (imaginary * other.real);
        real = newReal;
        imaginary = newImaginary;
    }
}
