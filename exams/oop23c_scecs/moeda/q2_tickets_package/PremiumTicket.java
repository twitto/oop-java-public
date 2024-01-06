package exams.oop23c_scecs.moeda.q2_tickets_package;

public class PremiumTicket extends ExtendedTicket
{
    protected MealType mealType;
    protected boolean priorityBoarding;

    public PremiumTicket(Passenger passenger, Seat seat, boolean hasBag, double baggageWeight, MealType mealType, boolean priorityBoarding)
    {
        super(passenger, seat, hasBag, baggageWeight);
        this.mealType = mealType;
        this.priorityBoarding = priorityBoarding;
    }
}
