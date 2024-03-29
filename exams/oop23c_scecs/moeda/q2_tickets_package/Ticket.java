package exams.oop23c_scecs.moeda.q2_tickets_package;

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
