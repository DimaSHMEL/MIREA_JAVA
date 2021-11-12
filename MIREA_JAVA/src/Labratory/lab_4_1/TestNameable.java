package Labratory.lab_4_1;

public class TestNameable {
    public static void main(String[] args) {
    Star sun = new Star("Sun");
    Planet earth = new Planet("Earth");
    Satellite moon = new Satellite("Moon");
    System.out.println(sun.getName());
    System.out.println((earth.getName()));
    System.out.println(moon.getName());
    }
}
