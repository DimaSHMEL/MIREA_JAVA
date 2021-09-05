package lab_2_2;

public class Hand {
    private String orientation;
    public Hand()
    {
        this.orientation = "None";
    }
    public Hand(String orientation)
    {
        this.orientation = orientation;
    }
    public String getOrientation() {
        return orientation;
    }
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
    public String toString() {
        return "This Hand is " + this.orientation;
    }
}
