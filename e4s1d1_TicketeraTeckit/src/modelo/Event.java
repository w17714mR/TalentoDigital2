package modelo;

import java.text.ParseException;
import java.util.ArrayList;

public class Event {

    private String name;
    private int minimumAge;
    private ArrayList<Ticket> ticketList;
    private boolean isStarted;

    public Event() {
        this.name = "";
        this.minimumAge = -1;
        this.ticketList = new ArrayList<>();
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
        if (isStarted)
            System.out.printf("El evento <%s> se ha cambiado: <EnCurso>", this.getName());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void sellTicket(Person p, Seller s, Ticket t) throws ParseException {
        if (p.getAge() > this.getMinimumAge()) {
            t.setUser(p);
            s.getSelledTickets().add(t);
            System.out.printf("Vendiendo entrada a cliente < %s > (< %s >) para evento"
                    + "< %s >", p.getName(), p.getDni(), this.getName());
            System.out.println();

        } else {
            System.out.println("No es posible vender entrada por límite de edad.");
        }
    }

    public void useTicket(Ticket t) {
        if (!t.isUsed()) {
            if (this.isStarted) {
                this.ticketList.get(this.ticketList.indexOf(t)).setUsed(true);
                System.out.printf("Usando entrada con cliente <%s> (<%s>) para evento\n" +
                        "<%s>", t.getUser().getName(), t.getUser().getDni(), this.getName());
                System.out.println();
                if (this.ticketList.contains(t)) {
                    System.out.printf("Entrada encontrada, <%s> puede pasar.", t.getUser().getName());
                    System.out.println();
                } else {
                    System.out.println("Entrada no pertenece a este evento.");
                }
                System.out.println();
            } else {
                System.out.printf("No se puede usar la entrada porque el evento <%s> no está en curso.", this.getName());
                System.out.println();
            }
        } else {
            System.out.printf("Usando entrada con cliente %s (%s) para evento %s." +
                    "Entrada para rut %s ya fue usada, no puede pasar", t.getUser().getName(), t.getUser().getDni(), this.getName(), t.getUser().getDni());
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", minimumAge=" + minimumAge +
                ", ticketList=" + ticketList +
                ", isStarted=" + isStarted +
                '}';
    }
}
