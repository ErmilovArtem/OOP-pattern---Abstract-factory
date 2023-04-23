package AbstractFactory.AbstractClass;

public abstract class APassenger {
    private int ticket = 0;

    public APassenger(int ticket) {
        this.ticket = ticket;
    }

    public int getNumberTicket() {
        return ticket;
    }
}
