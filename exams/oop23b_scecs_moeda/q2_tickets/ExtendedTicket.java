package exams.oop23b_scecs_moeda.q2_tickets;

public class ExtendedTicket extends Ticket
{
    protected double baggageWeight;

    public ExtendedTicket(Passenger passenger, Seat seat, boolean hasBag, double baggageWeight)
    {
        super(passenger, seat, hasBag);
        this.baggageWeight = baggageWeight;
    }
}
