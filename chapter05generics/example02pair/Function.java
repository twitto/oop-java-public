package chapter05generics.example02pair;

class Function<F, S>
{
    private Pair<F, S>[] pairs;
    private int size;

    public Function(int capacity)
    {
        this.pairs = (Pair<F, S>[]) new Pair[capacity];
        this.size = 0;
    }

    public void addPair(Pair<F, S> pair)
    {
        for (int i = 0; i < size; i++) {
            if (pairs[i].getFirst().equals(pair.getFirst())) {
                throw new IllegalArgumentException("Duplicate input value");
            }
        }
        pairs[size++] = pair;
    }

    public S evaluate(F x)
    {
        for (int i = 0; i < size; i++) {
            if (pairs[i].getFirst().equals(x)) {
                return pairs[i].getSecond();
            }
        }
        return null;
    }
}
