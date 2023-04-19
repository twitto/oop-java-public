package chapter06specials.enums.example01basics;

public class Main
{
    public static void main(String[] args)
    {
        Day today = Day.MONDAY;
        Day tomorrow = Day.TUESDAY;

        System.out.println("Today is " + today);
        System.out.println("Tomorrow is " + tomorrow);

        if (today == Day.FRIDAY || today == Day.SATURDAY)
            System.out.println("It's the weekend!");
        else
            System.out.println("It's a weekday.");
    }
    //Today is MONDAY
    //Tomorrow is TUESDAY
    //It's a weekday.
}
