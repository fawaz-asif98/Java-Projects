package P05.full_credit;

import java.util.ArrayList;

public class Computer
{
    private String name;
    private String model;
    private ArrayList <Option> options = new ArrayList<>();

    public Computer(String name, String model)
    {
        this.name = name;
        this.model = model;
    }

    public void addOption(Option option)
    {
        options.add(option);
    }

    public long cost()
    {
        long costSum = 0;
        for(Option addCoster : options)
        {
            costSum += addCoster.cost();
        }
        return costSum;
    }

    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }

        Computer daComputer = (Computer) o;
        return this.toString().equals(daComputer.toString());
        
    }

    public String toString()
    {
        return name + "(" + model + ")";
    }
}