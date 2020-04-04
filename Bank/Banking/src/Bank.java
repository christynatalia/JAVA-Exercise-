import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;
    private String bankName;




    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomer(String firstName , String lastName)
    {
        this.customers.add(new Customer(firstName, lastName));
        numberOfCustomers++ ;

    }

    public void addCustomer(Customer customer, ArrayList<Customer> customers){
        this.customers.add(customer);
        numberOfCustomers++;
    }

    public int getNumOfCustomers(){
        return numberOfCustomers++;
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }


    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                ", numberOfCustomers=" + numberOfCustomers +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
