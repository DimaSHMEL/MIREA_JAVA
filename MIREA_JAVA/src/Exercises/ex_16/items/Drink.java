package Exercises.ex_16.items;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String descp;
    public Drink(String name, String descp)
    {
        this.name = name;
        this.descp = descp;
        this.cost = 0;
    }
    public Drink(String name, String descp, int cost)
    {
        this.name = name;
        this.descp = descp;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDescp() {
        return descp;
    }

    public double getCost() {
        return cost;
    }
}
