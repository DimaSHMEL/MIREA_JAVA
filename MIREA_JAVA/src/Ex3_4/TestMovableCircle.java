package Ex3_4;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle ball = new MovableCircle(0,0,2,3, 10);
        System.out.println(ball);
        ball.moveDown();
        System.out.println(ball);
        ball.moveRight();
        System.out.println(ball);
        ball.moveUp();
        System.out.println(ball);
        ball.moveLeft();
        System.out.println(ball);
    }
}
