package Labratory.lab_2_2;

public class Human {
     class Hand {
        private String orientation;
        public Hand(String orientation)
        {
            this.orientation = orientation;
        }
        public String toString() {
            return "This Hand is " + this.orientation;
        }
    }
     class Head {
        private String hair_color;
        public Head()
        {
            this.hair_color = "Black";
        }
        public String toString()
        {
            return "This head has " + this.hair_color + " Hair color";
        }
    }
     class Leg {
        public String orientation;
        public Leg(String or)
        {
            this.orientation = or;
        }
        public String toString()
        {
            return "This is " + this.orientation + " leg.";
        }
    }
    Head head;
    Hand left_h, right_h;
    Leg left_l, right_l;
    String name;
    public Human()
    {
        this.head = new Head();
        this.left_h = new Hand("Left");
        this.right_h = new Hand("Right");
        this.left_l = new Leg("Left");
        this.right_l = new Leg("Right");
        this.name = "Bob";
    }
    public Human(String name)
    {

        this.head = new Head();
        this.left_h = new Hand("Left");
        this.right_h = new Hand("Right");
        this.left_l = new Leg("Left");
        this.right_l = new Leg("Right");
        this.name = name;
    }
    public String toString() {
        return "Human name is " + this.name + "\n" + this.head + "\n" + this.left_h +
                "\n" + this.right_h + "\n" + this.left_l + "\n" + this.right_l;
    }
}
