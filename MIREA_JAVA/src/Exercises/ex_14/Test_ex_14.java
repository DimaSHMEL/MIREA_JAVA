package Exercises.ex_14;

public class Test_ex_14 {
    public static void main(String[] args) {
        Task_1 t1 = new Task_1("Shmelev");
        System.out.println(t1);
        System.out.println();

        task_2 t2 = new task_2();
        t2 = new task_2(2020, 12, 20);
        System.out.println();

        Student person = new Student("Dmitrii", "Shmelev", 2002, 12, 6);
        person.setformat("short");
        System.out.println(person);
        System.out.println();

        person.setformat("medium");
        System.out.println(person);
        System.out.println();

        person.setformat("long");
        System.out.println(person);
        System.out.println();
        task_4 t4 = new task_4();
        System.out.println(t4);

        task_5 t5 = new task_5();
    }
}
