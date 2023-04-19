package chapter06specials.enums.example02methods;

public enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend()
    {
        return this == FRIDAY || this == SATURDAY;
    }

    public boolean isWorkday()
    {
        return !isWeekend();
    }
}
