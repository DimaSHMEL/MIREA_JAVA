package ex_10.ex_2;

public class Client {
    Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public void sit()
    {
        System.out.println("I'm sitting on " + chair);
    }
}
