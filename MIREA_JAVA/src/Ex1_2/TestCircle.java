package Ex1_2;

public class TestCircle {
    public static void main(String[] args)
    {
        Ball A = new Ball();
        Ball B = new Ball(2.0);
        Ball C = new Ball(3.0, "Cyan");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        A.setColor("BLUE");
        A.setRad(10.0);
        System.out.println(A);
    }

}
