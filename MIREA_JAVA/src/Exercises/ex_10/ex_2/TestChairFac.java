package Exercises.ex_10.ex_2;

public class TestChairFac
{
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client person = new Client();

        person.setChair(factory.createMagicChair());
        person.sit();
        person.chair.sum(10, 5);
        person.chair.doMagic();

        person.setChair(factory.createFunctionalChair());
        person.sit();
        person.chair.getAge();
        System.out.println(person.chair.sum(10, 5));

        person.setChair(factory.createVictorianChair());
        person.sit();
        person.chair.getAge();
        person.chair.doMagic();
    }
}
