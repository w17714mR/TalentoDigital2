package modelo;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String dni;
    private String name;
    private String dateOfBirth;

    public Person() {
        this.dni = "";
        this.name = "";
        this.dateOfBirth = "";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public int getAge() throws ParseException {
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.parse(dateOfBirth);
        Period period = Period.between(birth, now);
        return period.getYears();

    }
}
