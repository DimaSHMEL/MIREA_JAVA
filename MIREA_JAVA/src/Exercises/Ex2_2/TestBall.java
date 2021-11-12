package Exercises.Ex2_2;

public class TestBall
{
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(1.0, 2.0);
        System.out.println(b1);
        System.out.println(b2);
        b1.setXY(3.0, 4.0);
        b2.move(5.0, 6.0);
        System.out.println("Changes was made");
        System.out.println(b1);
        System.out.println(b2);
    }
}
