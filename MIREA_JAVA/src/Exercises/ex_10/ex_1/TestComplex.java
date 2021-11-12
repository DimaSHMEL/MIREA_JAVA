package Exercises.ex_10.ex_1;

public class TestComplex {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        System.out.println(complex);
        complex = factory.CreateComplex(10,5);
        System.out.println(complex);

    }
}
