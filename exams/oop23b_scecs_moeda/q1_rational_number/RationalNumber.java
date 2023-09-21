package exams.oop23b_scecs_moeda.q1_rational_number;

public class RationalNumber
{
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator)
    {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator cannot be zero");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        RationalNumber other = (RationalNumber) obj;
        return (numerator * other.denominator) == (denominator * other.numerator);
    }

    public void add(RationalNumber other)
    {
        numerator = numerator * other.denominator + other.numerator * denominator;
        denominator = denominator * other.denominator;
    }

    public void multiply(RationalNumber other)
    {
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
    }
}

