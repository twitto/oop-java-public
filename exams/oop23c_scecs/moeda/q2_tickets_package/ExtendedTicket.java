package exams.oop23c_scecs.moeda.q2_tickets_package;

public class ExtendedTicket extends Ticket
{
    protected double baggageWeight;

    public ExtendedTicket(Passenger passenger, Seat seat, boolean hasBag, double baggageWeight)
    {
        super(passenger, seat, hasBag);
        this.baggageWeight = baggageWeight;
    }
}
