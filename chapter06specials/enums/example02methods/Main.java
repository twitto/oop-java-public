package chapter06specials.enums.example02methods;

public class Main
{
    public static void main(String[] args)
    {
        Day today = Day.WEDNESDAY;

        System.out.println("Today is " + today);
        System.out.println("Is today a weekend day? " + today.isWeekend());
        System.out.println("Is today a workday? " + today.isWorkday());
    }
}
//Output
// Today is WEDNESDAY
//Is today a weekend day? false
//Is today a workday? true

