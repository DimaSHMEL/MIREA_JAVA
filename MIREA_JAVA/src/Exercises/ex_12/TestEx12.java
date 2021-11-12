package Exercises.ex_12;

public class TestEx12 {
    public static void main(String[] args) {
        //Первое задание
        Person human_1 = new Person("Shmel");
        Person human_2 = new Person("Shmel", "Dmitrii");
        Person human_3 = new Person("Shmel", "Dmitrii", "Vladimir");
        System.out.println(human_1.getSurinit());
        System.out.println(human_2.getSurinit());
        System.out.println(human_3.getSurinit() + "\n");
        //Второе задание
        Adressgetter adress = new Adressgetter();
        adress.setall_split("Страна, Регион, Город, Улица, Дом, Корпус, Квартира");
        System.out.println(adress);
        adress.setall_token("Country, Region. City; Street- Home, Building. Flat");
        System.out.println(adress + "\n");
        //Третье задание
        String[] shirts = { "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White TShirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S",
        };
        creator_Shirts Creator = new creator_Shirts();
        Shirt[] shop = Creator.create_shirt_arr(shirts);
        for(int i = 0; i < shop.length; i++)
        {
            System.out.println("Item number " + (i + 1));
            System.out.println(shop[i]);
        }
        //Четвёртое задание
        TelephoneEncoder E = new TelephoneEncoder();
        String phone = E.normalPhone("104289652211");
        System.out.println(phone);
    }

}
