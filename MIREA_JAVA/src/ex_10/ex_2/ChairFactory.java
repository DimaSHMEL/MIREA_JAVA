package ex_10.ex_2;

public class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public MagicanChair createMagicChair() {
        return new MagicanChair();
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair((int) (Math.random() * 1000));
    }
}
class VictorianChair implements Chair
{
    int age;
    public VictorianChair(int age)
    {
        this.age = age;
    }
    public String toString() {
        return "VictorianChair "+
                "age=" + age;
    }
    public int sum(int a, int b) {
        System.out.println("Wrong type of chair");
        return 0;
    }
    public void doMagic() {
        System.out.println("Wrong type of chair");
    }
    public int getAge() {
        return this.age;
    }
}
class MagicanChair implements Chair
{
    public int sum(int a, int b) {
        System.out.println("Wrong type of chair");
        return -1;
    }
    public void doMagic() {
        System.out.println("Skidadle Skidodle");
    }
    public int getAge() {
        System.out.println("Wrong type of chair");
        return 0;
    }
    public String toString() {
        return "MagicChair";
    }
}
class FunctionalChair implements Chair
{
    public String toString() {
        return "Functional chair";
    }
    public int sum(int a, int b) {
        return a + b;
    }
    public void doMagic() {
        System.out.println("Wrong type of chair");
    }
    public int getAge() {
        System.out.println("Wrong type of chair");
        return 0;
    }
}
