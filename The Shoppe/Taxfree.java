package P04.full_credit;

public class Taxfree extends Product
{
    public Taxfree(String name, double cost)
    {
        super(name, cost);

    }

    @Override
    public double price()
    {
        return cost;
    }
}
