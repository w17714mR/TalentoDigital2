import modelo.*;

import java.text.ParseException;

public class Test {

    public static void main(String[] args) throws ParseException {

        Event e = new Event();
        e.setName("BAD BUNNY EN CHILE");
        e.setMinimumAge(18);
        System.out.println("Creando evento <" + e.getName() + "> (Edad mínima: <" + e.getMinimumAge() + ">)");

        Ticket t1 = new Ticket();
        t1.setPrice(4000);
        t1.setSeatNumber(1);
        Ticket t2 = new Ticket();
        t2.setPrice(4000);
        t2.setSeatNumber(2);
        VipTicket vt1 = new VipTicket();
        vt1.setPrice(8000);
        vt1.setSeatNumber(3);
        vt1.setGift(true);

        e.getTicketList().add(t1);
        e.getTicketList().add(t2);
        e.getTicketList().add(vt1);

        Person p = new Person();
        p.setName("William Rehel");
        p.setDateOfBirth("1991-01-04");
        p.setDni("17.387.103-3");
        Person m = new Person();
        m.setName("Juancito Rey");
        m.setDateOfBirth("2010-02-13");
        m.setDni("21.123.456-7");
        Seller s = new Seller();
        s.setName("Camila Rojas");
        s.setDateOfBirth("1993-02-10");
        s.setDni("18.087.726-6");

        e.sellTicket(p, s, t1);
        e.sellTicket(m, s, t2);
        e.sellTicket(p, s, vt1);
        e.sellTicket(p, s, t2);

        e.useTicket(t1);
        e.setStarted(true);
        e.useTicket(t1);
        e.useTicket(t1);

        s.showSelledTickets();
    }

}
