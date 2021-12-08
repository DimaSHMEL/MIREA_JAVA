package Labratory.lab_12;

public class Testlab12 {
    public static void main(String[] args) {
        String date = "29/02/2000";
        RegularString reg = new RegularString();
        System.out.println(reg.ex_1("123 RUB"));
        System.out.println(reg.ex_3(date));

        System.out.println(reg.ex_4(("aza@")));
    }
}
