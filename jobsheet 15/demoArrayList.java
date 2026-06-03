
import java.util.ArrayList;


public class demoArrayList {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<> (2);

        customer customer1 = new customer(1, "Zakia");
        customer customer2 = new customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);
    
        customers.add(new customer(4, "Cica"));

        customers.add(2, new customer(100, "Rosa"));

        for (customer cust : customers) {
            System.out.println(cust.toString());
        }

    }
}
