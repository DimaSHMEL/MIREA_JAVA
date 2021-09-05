package Ex3_4;

public class MovablePoint implements  Movable{
    private int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveDown() {
        this.y -= this.ySpeed;
    }
    public void moveUp() {
        this.y += this.ySpeed;
    }
    public void moveLeft() {
        this.x -= this.xSpeed;
    }
    public void moveRight() {
        this.x -= this.xSpeed;
    }
    public String toString() {
        return "(x=" + x + ", y=" + y +
                "), (xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ')';
    }
}
