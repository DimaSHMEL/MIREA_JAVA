package Ex1_2;

public class Ball {
    private double rad;
    private String color;
    public Ball()
    {
        rad  = 1;
        color = "Red";
    }
    public Ball(double R)
    {
        rad = R;
        color = "Red";
    }
    public Ball(double R, String CLR)
    {
        rad = R;
        color = CLR;
    }
    public double getRad()
    {
        return this.rad;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setRad(double nr)
    {
        rad = nr;
    }
    public void setColor(String ncl)
    {
        color = ncl;
    }
    public String toString()
    {
        return "Ball color is " + this.color + " and its Radius is " + this.rad;
    }
}
