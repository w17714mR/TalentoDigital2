import model.*;

import java.util.ArrayList;

public class Test {

    Menu m = null;

    public static void main(String[] args) {

        Customer u1 = new Customer();

        u1.setName("WILLIAM");
        u1.setDni("16387103");
        u1.setDateOfBirth("1991-01-04");
        u1.setPassword(7103);

        Customer u2 = new Customer();
        u2.setName("ALICIA");
        u2.setDni("18087726");
        u2.setDateOfBirth("10/11/1991");

        AccountExec a = new AccountExec();
        a.setName("PAULA");
        a.setPhone("961136457");
        a.setDireccion("Pablo Neruda 046, Santiago.");

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(u1);
        customerList.add(u2);

        CheckingAccount cku1 = new CheckingAccount();
        cku1.setAccountExec(a);
        cku1.setAvailable(7000);
        cku1.setMonthlyPrice(false);

        CreditCard ccu1 = new CreditCard();

        u1.setCa(cku1);
        u1.setCc(ccu1);
        Menu m = new Menu();
        m.StartMenu(customerList);
    }
}

