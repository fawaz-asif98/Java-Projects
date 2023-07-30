package P04.full_credit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Store
{
    public static void main(String args[])
    {

        //holds a reference to each item in products that has been selected for purchase 
        ArrayList<Product>shoppingCart = new ArrayList<Product>();
        Taxed.setTaxRate(.075);
        //reference to each item available for purchase
        ArrayList<Product>products = new ArrayList<Product>();

                products.add(new Taxfree("Bread", 4.99));
                products.add(new Taxfree("Eggs", 3.55));
                products.add(new Taxfree("Milk", 2.89));
                products.add(new Taxed("Printer Paper", 8.25));
                products.add(new Taxed("Microwave", 60.10));
                products.add(new Taxed("Candle", 6.05));

        boolean doneShopping = false;
        Scanner scanInput = new Scanner(System.in);
        // loop to iterate over all items
        while(doneShopping == false)
        {
            System.out.println("\n ===========================");
            System.out.printf("    Welcome to the Store\n");
            System.out.println(" ===========================\n");
            // list all items
            for(int i = 0; i < products.size(); ++i)
            {
                System.out.println((i) + ") " + products.get(i).toString());
            }
            try
            {
                System.out.print("\nWhat product do you want to buy?\n");
                int orderNum = scanInput.nextInt();
                    
                if(orderNum == -1)
                {
                    doneShopping = true;
                }

                else if(orderNum < 0 || orderNum > products.size())
                {
                    System.err.println("Not a valid item!");
                    // can be commented out to let users try again
                    throw new IllegalArgumentException("Not a valid item!");
                    
                }

                else
                {
                    //add user selection to shopping cart
                    Product selectedProduct = products.get(orderNum);
                    shoppingCart.add(selectedProduct);
                    System.out.println("\n   Current Order\n -----------------");
                    for(int i = 0; i < shoppingCart.size(); ++i)
                    {
                        System.out.println(" " + shoppingCart.get(i).toString());
                    }
                }
            }

            catch(InputMismatchException wrongAnswer)
            {
                System.err.println("Not a valid order number!\n");
                System.exit(-1);
            }
        }

            System.out.printf("\n");
    }
}