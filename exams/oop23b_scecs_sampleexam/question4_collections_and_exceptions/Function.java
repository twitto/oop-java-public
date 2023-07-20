package exams.oop23b_scecs_sampleexam.question4_collections_and_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Function<A, B>
{
    private List<Pair<A, B>> pairs;

    private List<A> firstValues;
    private List<B> secondValues;

    public Function()
    {
        this.pairs = new ArrayList<>();
    }

    public void addPair(Pair<A, B> pair)
    {
        for (Pair<A, B> existingPair : pairs)
            if (existingPair.first().equals(pair.first()))
                throw new RuntimeException("Duplicate first value found in pairs.");
        pairs.add(pair);
    }

    public B evaluate(A value)
    {
        for (Pair<A, B> pair : pairs)
            if (pair.first().equals(value))
                return pair.second();
        throw new RuntimeException("No matching pair found for the given value.");
    }
}


