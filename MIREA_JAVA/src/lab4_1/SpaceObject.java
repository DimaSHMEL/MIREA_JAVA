package lab4_1;

public abstract class SpaceObject {
    private String name;
    public SpaceObject(String name)
    {
        this.name = name;
    }
    public String getname() {
        return name;
    }
}
class Star extends SpaceObject implements Nameable
{
    public Star(String name)
    {
        super(name);
    }
    public String getName()
    {
        return "This is Star it's name is " + this.getname();
    }
}
class Planet extends SpaceObject implements Nameable
{
    public Planet(String name)
    {
        super(name);
    }
    public String getName()
    {
        return "This is Planet it's name is " + this.getname();
    }
}
class Satellite extends SpaceObject implements Nameable
{
    public Satellite(String name)
    {
        super(name);
    }
    public String getName()
    {
        return "This is Satellite it's name is " + this.getname();
    }
}
