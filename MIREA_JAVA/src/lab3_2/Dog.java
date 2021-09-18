package lab3_2;

public abstract class Dog {
    private String name;
    private String color;
    private String species;
    public Dog(String name, String color, String species)
    {
        this.name = name;
        this.color = color;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSpecies() {
        return species;
    }

    public abstract String toString();
}

class Doge extends Dog
{
    public Doge(String name, String color)
    {
        super(name, color, "Doge");
    }
    public String toString() {
        return "Whoh, I'm " + this.getName() +
                " my color is " + this.getColor() +
                " and I'm " + this.getSpecies();
    }
}
class Korgi extends Dog
{
    public Korgi(String name, String color)
    {
        super(name, color, "Korgi");
    }
    public String toString() {
        return "Whohf, I'm " + this.getName() +
                " my color is " + this.getColor() +
                " and I'm " + this.getSpecies();
    }
}
class Shepherd extends Dog
{
    public Shepherd(String name, String color)
    {
        super(name, color, "Shepherd");
    }
    public String toString() {
        return "Whoooof, I'm " + this.getName() +
                " my color is " + this.getColor() +
                " and I'm " + this.getSpecies();
    }
}