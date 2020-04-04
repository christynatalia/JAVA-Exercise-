import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
    Bank b1 = new Bank ("HSBC");

    b1.addCustomer("David","Putra");



    Customer c1 = new Customer("Alina","Putri");
    b1.addCustomer(c1,customers);

    Account a1 = new Account(70.00);
    c1.setAccount(a1);
    a1.deposit(30.00);
    a1.withdraw(50.00);

    System.out.println(b1.getNumOfCustomers());
    System.out.println(b1.getCustomer(0));

    }
}

