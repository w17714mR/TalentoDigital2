package modelo;

public class VipTicket extends Ticket {

    private boolean gift;

    public VipTicket() {
        this.gift = false;
    }

    public boolean isGift() {
        return gift;
    }

    public void setGift(boolean gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "VipTicket{" +
                "gift=" + gift +
                '}';
    }
}
