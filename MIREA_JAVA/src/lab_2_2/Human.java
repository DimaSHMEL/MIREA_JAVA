package lab_2_2;

public class Human {
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

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeft_h() {
        return left_h;
    }

    public Hand getRight_h() {
        return right_h;
    }

    public Leg getLeft_l() {
        return left_l;
    }

    public Leg getRight_l() {
        return right_l;
    }

    public String getName() {
        return name;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeft_h(Hand left_h) {
        this.left_h = left_h;
    }

    public void setRight_h(Hand right_h) {
        this.right_h = right_h;
    }

    public void setLeft_l(Leg left_l) {
        this.left_l = left_l;
    }

    public void setRight_l(Leg right_l) {
        this.right_l = right_l;
    }

    public String toString() {
        return "Human name is " + this.name + "\n" + this.head + "\n" + this.left_h +
                "\n" + this.right_h + "\n" + this.left_l + "\n" + this.right_l;
    }
}
