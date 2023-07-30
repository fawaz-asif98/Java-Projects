package P05.full_credit;
import java.util.ArrayList;

public class Order 
{
    private static long nextOrderNumber = 0;
    private long orderNumber;

    private Customer customer;
    private ArrayList<Computer>computers = new ArrayList<>();

    public Order(Customer customer)
    {
        this.customer = customer;
        orderNumber = orderNumber++;
    }

    public void addComputer(Computer computer)
    {
        computers.add(computer);
    }

    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }

        if( (o == null) || getClass() != o.getClass())
        {
            return false;
        }

        Order daOrder = (Order) o;
        return customer.equals(daOrder.customer) && computers.equals(daOrder.computers);
    }

    public String toString()
    {
        return "Order " + orderNumber + "for " + customer;
    }
}
