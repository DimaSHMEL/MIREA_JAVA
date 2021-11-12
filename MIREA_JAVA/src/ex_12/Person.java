package ex_12;

public class Person {
    String Surname = "", name = "", Fathername = "";
    String init = "";
    //Создание персоны с фамилией
    public Person(String Surname)
    {
        this.Surname = Surname;
    }
    //Создание персоны с фамилией именем
    public Person(String Surname, String name)
    {
        this.Surname = Surname;
        this.name = name;
        //Созание инициалов
        this.init = name.charAt(0) + ".";
    }
    //Создание персоны с фамилией именем отчеством
    public Person(String Surname, String name, String Fathername)
    {
        this.Surname = Surname;
        this.name = name;
        this.Fathername = Fathername;
        //Созание инициалов
        this.init = name.charAt(0) + "." + Fathername.charAt(0) + ".";
    }
    public String getSurinit()
    {
        //требуемый вывод
        return Surname + " " + init;
    }

}
