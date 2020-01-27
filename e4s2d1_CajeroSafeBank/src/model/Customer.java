package model;

import java.time.LocalDate;
import java.time.Period;

public class Customer extends Person {

    private String dni;
    private String dateOfBirth;
    private int password;
    private CheckingAccount ca;
    private CreditCard cc;

    public Customer() {
        super();
        this.dni = "";
        this.dateOfBirth = "";
        this.password = -1111;
        this.ca = new CheckingAccount();
        this.cc = new CreditCard();
    }

    public CheckingAccount getCa() {
        return ca;
    }

    public void setCa(CheckingAccount ca) {
        this.ca = ca;
        ca.setAccountNumber("00-" + this.getDni().toString());
    }

    public CreditCard getCc() {
        return cc;

    }

    public void setCc(CreditCard cc) {
        this.cc = cc;
        cc.setAccountNumber("01-" + this.getDni().toString());
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "dni='" + dni + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", password=" + password +
                ", ca=" + ca +
                ", cc=" + cc +
                '}';
    }

    public int calcularEdad() {
        LocalDate pri = LocalDate.parse(dateOfBirth);
        LocalDate sec = LocalDate.now();
        Period lapse = Period.between(pri, sec);
        return lapse.getYears();
    }
}
