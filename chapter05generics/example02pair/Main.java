package chapter05generics.example02pair;

public class Main
{
    public static void main(String[] args)
    {
        Pair<Integer, String> idCard = new Pair<>(123, "abcd");
        idCard.setFirst(111);

        Pair<Double, Double> point = new Pair<>(1.0, 2.0);
        point.setFirst(10.0);
    }
}
