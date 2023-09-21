package chapter06specials.records.example02generic;

import java.util.Objects;

public class PairClass<F, S>
{
    private final F first;
    private final S second;

    public PairClass(F first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public F first()
    {
        return first;
    }

    public S second()
    {
        return second;
    }

    @Override
    public String toString()
    {
        return "PairClass{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PairClass<?, ?> pairClass = (PairClass<?, ?>) o;
        return Objects.equals(first, pairClass.first) && Objects.equals(second, pairClass.second);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(first, second);
    }
}
