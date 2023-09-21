package chapter06specials.records.example03full;

public class Main2
{
    public static void main(String[] args)
    {
        int x = 7;

        String s;
        if (x > 0)
            s = "positive";
        else
            s = "not positive";

        String s2 = (x > 0) ? "positive" : "not positive";
        System.out.println("s2 = " + s2);


        if (x > 0)
            System.out.println("positive");
        else
            System.out.println("not positive");

        System.out.println((x > 0) ? "positive" : "not positive");

        //(x > 0)? "positive" : "not positive";
    }
}
