package P05.full_credit;

public class Customer
{
    private String name;
    private String email;

    public Customer(String name, String email)
    {
        this.name = name;
        this.email= email;
        if(email.indexOf("@.") == -1)
        {
            throw new IllegalArgumentException("not a valid email with @ and .");
        }
    }

    public String toString()
    {
        return name + "(" + email + ")";
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

        Customer daCustomer = (Customer) o;
        return email.equals(daCustomer.email);
    }
}
