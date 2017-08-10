// This programs demonstrates using static data members
// Chinmay Shah
import java.util.Scanner;

class customer{
    int customer_id;
    static int counter = 0;

    customer()
    {
        customer_id = 1001;
    }

    void setCustomerId()
    {
        customer_id = 1001+counter;
        counter++;
    }
    int getCustomerId()
    {
        return customer_id;
    }

    int totalNoOfCustomers()
    {
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        customer c1 = new customer();
        c1.setCustomerId();
        id = c1.getCustomerId();
        System.out.println( id );
        customer c2= new customer();
        c2.setCustomerId();
        id = c2.getCustomerId();
        System.out.println(id);
    }
}