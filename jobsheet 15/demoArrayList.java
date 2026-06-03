
import java.util.ArrayList;


public class demoArrayList {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<> (2);
        ArrayList<customer> newCustomers = new ArrayList<> ();
        newCustomers.add(new customer(201, "Della"));
        newCustomers.add(new customer(202, "Victor"));
        newCustomers.add(new customer(203, "Sarah"));

        customers.addAll(newCustomers);

        customer customer1 = new customer(1, "Zakia");
        customer customer2 = new customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);
    
        customers.add(new customer(4, "Cica"));

        customers.add(2, new customer(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        System.out.println(customers);

    }
}
