package lab_2_2;

public class Head {
    private String hair_color;
    public Head()
    {
        this.hair_color = "Black";
    }
    public Head(String color)
    {
        this.hair_color = color;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }
    public String toString()
    {
        return "This head has " + this.hair_color + " Hair color";
    }
}
