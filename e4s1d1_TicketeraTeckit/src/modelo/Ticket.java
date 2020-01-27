package modelo;

public class Ticket {

    private int price;
    private int seatNumber;
    private Person user;
    private boolean used;

    public Ticket() {
        this.price = -1;
        this.seatNumber = -1;
        this.user = new Person();
        this.used = false;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", seatNumber=" + seatNumber +
                ", user=" + user +
                ", used=" + used +
                '}';
    }
}
