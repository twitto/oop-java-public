package exams.oop23b_scecs.oop23b_scecs_moeda.q2_tickets;

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
