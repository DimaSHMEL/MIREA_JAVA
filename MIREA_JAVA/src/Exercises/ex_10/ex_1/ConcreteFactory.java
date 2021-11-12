package Exercises.ex_10.ex_1;

public class ConcreteFactory implements ComplexAbstarctFactory{

    public Complex createComplex() {
        return new Complex();
    }
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,  image);
    }
}
class Complex
{
    int real, image;

    public Complex()
    {
        this.image = 0;
        this.real = 0;
    }
    public Complex(int real, int image)
    {
        this.image = image;
        this.real = real;
    }
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
