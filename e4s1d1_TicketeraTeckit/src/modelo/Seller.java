package modelo;

import java.util.ArrayList;

public class Seller extends Person {

    private ArrayList<Ticket> selledTickets;

    public Seller() {
        this.selledTickets = new ArrayList<>();
    }

    public ArrayList<Ticket> getSelledTickets() {
        return selledTickets;
    }

    public void setSelledTickets(ArrayList selledTickets) {
        this.selledTickets = selledTickets;
    }

    public void showSelledTickets() {
        ArrayList<Ticket> n = new ArrayList<>();
        ArrayList<Ticket> v = new ArrayList<>();
        for (Ticket t : this.getSelledTickets()) {
            System.out.println(t.getSeatNumber());
            if (t instanceof VipTicket) {
                v.add(t);
            } else if (t instanceof Ticket) {
                n.add(t);
            }
        }
        System.out.println();
        System.out.printf("El vendedor %s ha vendido: ", this.getName());
        System.out.println();


    }

    @Override
    public String toString() {
        return "Seller{" +
                "selledTickets=" + selledTickets +
                '}';
    }
}
