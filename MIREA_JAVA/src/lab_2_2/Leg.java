package lab_2_2;

public class Leg {
    public String orientation;
    public Leg()
    {
        this.orientation = "NONE";
    }
    public Leg(String or)
    {
        this.orientation = or;
    }
    public String getOrientation()
    {
        return this.orientation;
    }
    public void setOrientation(String or)
    {
        this.orientation = or;
    }
    public String toString()
    {
        return "This is " + this.orientation + " leg.";
    }
}
