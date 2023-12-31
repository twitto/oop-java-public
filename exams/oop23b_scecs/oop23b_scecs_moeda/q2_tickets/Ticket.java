package exams.oop23b_scecs.oop23b_scecs_moeda.q2_tickets;

public class Ticket
{
    protected Passenger passenger;
    protected Seat seat;
    protected boolean hasBag;

    public Ticket(Passenger passenger, Seat seat, boolean hasBag)
    {
        this.passenger = passenger;
        this.seat = seat;
        this.hasBag = hasBag;
    }
}
