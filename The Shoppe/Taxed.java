package P04.full_credit;

public class Taxed extends Product
{
    private static double salesTaxRate = 0.0;

    public Taxed(String name, double cost)
    {
        super(name, cost);

    }

    public static double setTaxRate(double salesTax)
    {
        // return Taxed.setTaxRate(0.625);
        salesTaxRate = salesTax;
        return salesTaxRate;
    }

    @Override
    public double price()
    {
        return cost * (1 + salesTaxRate);
    }
}
